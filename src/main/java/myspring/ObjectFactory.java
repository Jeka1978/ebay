package myspring;

import heroes.InjectRandomName;
import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import org.reflections.Reflections;

import javax.annotation.PostConstruct;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Evegeny on 20/11/2016.
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private Reflections reflections = new Reflections("myspring");
    private List<ObjectConfigurer> objectConfigurers = new ArrayList<>();
    private List<ProxyConfigurer> proxyConfigurers = new ArrayList<>();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    @SneakyThrows
    private ObjectFactory() {
        Set<Class<? extends ObjectConfigurer>> classes = reflections.getSubTypesOf(ObjectConfigurer.class);
        for (Class<? extends ObjectConfigurer> clazz : classes) {
            if (!Modifier.isAbstract(clazz.getModifiers())) {
                objectConfigurers.add(clazz.newInstance());
            }
        }
        Set<Class<? extends ProxyConfigurer>> classes2 = reflections.getSubTypesOf(ProxyConfigurer.class);
        for (Class<? extends ProxyConfigurer> clazz : classes2) {
            if (!Modifier.isAbstract(clazz.getModifiers())) {
                proxyConfigurers.add(clazz.newInstance());
            }
        }
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        type = resolveImpl(type);
        T t = type.newInstance();
        configure(t);
        invokeInitMethod(type, t);
        t = wrapWithProxy(type, t);
        return t;
    }






















    private <T> T wrapWithProxy(Class<T> type, T t) {
        for (ProxyConfigurer proxyConfigurer : proxyConfigurers) {
            t = proxyConfigurer.wrapWithProxy(t, type);
        }
        return t;
    }

    private <T> void invokeInitMethod(Class<T> type, T t) throws IllegalAccessException, InvocationTargetException {
        Method[] methods = type.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(PostConstruct.class)) {
                method.setAccessible(true);
                method.invoke(t);
            }
        }
    }

    private <T> void configure(T t) {
        for (ObjectConfigurer objectConfigurer : objectConfigurers) {
            objectConfigurer.configure(t);
        }
    }

    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            Class<T> impl = config.getImpl(type);
            if (impl == null) {
                Set<Class<? extends T>> classes = reflections.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new RuntimeException("0 or more than one impl for " + type + " was found, please bind needed impl via config");
                }
                type = (Class<T>) classes.iterator().next();
            }else {
                type = impl;
            }
        }
        return type;
    }
}

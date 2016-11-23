package myspring;

import lombok.extern.log4j.Log4j2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Evegeny on 20/11/2016.
 */
public class BenchmarkProxyConfigurer implements ProxyConfigurer {
    @Override
    public <T, E extends T> E wrapWithProxy(T t, Class<T> type) {
        boolean methodWantProxy = false;
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Benchmark.class)) {
                methodWantProxy = true;
                break;
            }
        }
        if (type.isAnnotationPresent(Benchmark.class) || methodWantProxy) {
            return (E) Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    Method originalMethod = type.getMethod(method.getName(), method.getParameterTypes());
                    if (originalMethod.isAnnotationPresent(Benchmark.class) || type.isAnnotationPresent(Benchmark.class)) {
                        System.out.println("************BENCHMARK START********* "+method.getName());
                        long start = System.nanoTime();
                        Object retVal = method.invoke(t, args);
                        long end = System.nanoTime();
                        System.out.println(end-start);
                        System.out.println("************BENCHMARK END********* "+method.getName());
                        return retVal;
                    }else {
                        return method.invoke(t, args);
                    }
                }
            });
        }
        return (E) t;
    }
}

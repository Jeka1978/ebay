package myspring;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 20/11/2016.
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        T t = type.newInstance();


        return t;
    }
}

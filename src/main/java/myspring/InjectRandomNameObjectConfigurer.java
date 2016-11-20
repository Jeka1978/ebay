package myspring;

import heroes.InjectRandomName;
import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

import java.lang.reflect.Field;

/**
 * Created by Evegeny on 20/11/2016.
 */
public class InjectRandomNameObjectConfigurer implements ObjectConfigurer {
    private DataFactory dataFactory = new DataFactory();

    @Override
    @SneakyThrows
    public void configure(Object t)  {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomName.class)) {
                String name = dataFactory.getName();
                field.setAccessible(true);
                field.set(t, name);
            }
        }

    }
}

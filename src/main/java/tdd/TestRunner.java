package tdd;

import java.lang.reflect.Method;

/**
 * Created by Evegeny on 20/11/2016.
 */
public class TestRunner {
    public static void runAllTestMethods(Class testClass) throws Exception {
        Method[] methods = testClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test")|| method.isAnnotationPresent(Test.class)) {
                Test annotation = method.getAnnotation(Test.class);
                Object o = testClass.newInstance();
                if (annotation != null) {
                    for (int i = 0; i < annotation.value()-1; i++) {

                        method.invoke(o);
                    }
                }
                method.invoke(o);
            }
        }

    }
}

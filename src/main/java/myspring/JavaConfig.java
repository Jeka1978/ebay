package myspring;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evegeny on 20/11/2016.
 */
public class JavaConfig implements Config {
    private Map<Class, Class> map = new HashMap<>();

    public JavaConfig() {
        map.put(Speaker.class, ConsoleSpeaker.class);
    }

    @Override
    public <T> Class<T> getImpl(Class<T> ifc) {
        return map.get(ifc);
    }
}

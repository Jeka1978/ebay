package myspring;

/**
 * Created by Evegeny on 20/11/2016.
 */
public interface ProxyConfigurer {
    <T, E extends T> E wrapWithProxy(T t, Class<T> type);
}

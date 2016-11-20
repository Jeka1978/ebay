package myspring;

/**
 * Created by Evegeny on 20/11/2016.
 */
public interface Config {
    <T> Class<T> getImpl(Class<T> type);
}

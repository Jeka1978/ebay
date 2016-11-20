package myspring;

/**
 * Created by Evegeny on 20/11/2016.
 */
public class ConsoleSpeaker implements Speaker {
    @Override
    @Benchmark
    public void sayMessage(String message) {
        System.out.println(message);
    }
}

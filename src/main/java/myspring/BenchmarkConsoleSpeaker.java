package myspring;

/**
 * Created by Evegeny on 20/11/2016.
 */
public class BenchmarkConsoleSpeaker implements Speaker {

    @InjectByFieldType
    private ConsoleSpeaker consoleSpeaker;


    @Override
    public void sayMessage(String message) {
        long start = System.nanoTime();
        consoleSpeaker.sayMessage(message);
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}

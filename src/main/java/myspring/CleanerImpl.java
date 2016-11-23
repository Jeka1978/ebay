package myspring;

/**
 * Created by Evegeny on 20/11/2016.
 */
@Benchmark
public class CleanerImpl implements Cleaner {
    private String name;

    @Override
    public void clean() {
        //20 lines of code
        System.out.println("VVVVVVVVVVVVVVVVVvvvvvvvvvvv");
    }
}

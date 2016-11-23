package myspring;

import heroes.Elf;

/**
 * Created by Evegeny on 20/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        CleanerImpl cleaner = ObjectFactory.getInstance().createObject(CleanerImpl.class);
        cleaner.clean();


    }
}

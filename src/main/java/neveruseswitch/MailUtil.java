package neveruseswitch;

import java.util.Random;

/**
 * Created by Evegeny on 23/11/2016.
 */
public class MailUtil {
    public static int getMailCode() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
}

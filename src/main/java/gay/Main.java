package gay;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Evegeny on 23/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        EbayService ebayService = new EbayService();
        while (true) {
            Random random = new Random();
            EbayPerson ebayPerson = new EbayPerson(new StringBuilder("blabla" + random.nextInt(100000)));
            if (random.nextInt(1000)==10) {
                ebayService.addToCache(ebayPerson);
            }
        }
    }
}

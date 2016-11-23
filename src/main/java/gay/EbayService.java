package gay;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 23/11/2016.
 */
public class EbayService {
    private List<EbayPerson> cacheEbayPersons = new ArrayList<>();

    public void addToCache(EbayPerson ebayPerson) {
        cacheEbayPersons.add(ebayPerson);
    }
}

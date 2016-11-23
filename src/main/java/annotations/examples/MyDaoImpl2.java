package annotations.examples;

import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Mongo
public class MyDaoImpl2 implements MyDao {
    @Override
    public void save() {
        System.out.println("saving to mongo");
    }
}

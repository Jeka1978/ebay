package annotations.examples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Repository
@MySql
public class MyDaoImpl implements MyDao {
    @Override
    public void save() {
        System.out.println("saving to mysql...");
    }
}

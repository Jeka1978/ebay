package annotations.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Service
public class MyService {
    @Mongo
    private MyDao myDao = new MyDao() {
        @Override
        public void save() {
            System.out.println("temp saving... default impl");
        }
    };

    @PostConstruct  //never call business from init method
    public void doWork(){
        myDao.save();
    }


}

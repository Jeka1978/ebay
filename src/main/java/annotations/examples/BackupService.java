package annotations.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Service
public class BackupService {
    @Autowired
    @MySql
    private MyDao myDao;

    @PostConstruct // never call business from @Postcontruct, just example
    public void init(){
        myDao.save();
    }

    public void doBackup(){
        myDao.save();
    }
}

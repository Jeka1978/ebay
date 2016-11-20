package myspring;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 20/11/2016.
 */
@Setter
public class IRobot {

    @InjectByFieldType
    private Speaker speaker;
    @InjectByFieldType
    private Cleaner cleaner;

    @PostConstruct
    private void init() {
        System.out.println(cleaner.getClass());
    }

    public void cleanRoom(){
        speaker.sayMessage("I started my work");
        cleaner.clean();
        speaker.sayMessage("I finished my work");
    }

}

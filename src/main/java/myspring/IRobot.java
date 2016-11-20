package myspring;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Evegeny on 20/11/2016.
 */
@ToString
@Getter
public class IRobot {

    @Setter
    private Speaker speaker = ObjectFactory.getInstance().createObject(Speaker.class);
    private Cleaner cleaner = ObjectFactory.getInstance().createObject(Cleaner.class);

    public void cleanRoom(){
        speaker.sayMessage("I started my work");
        cleaner.clean();
        speaker.sayMessage("I finished my work");
    }

}

package quoters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by Evegeny on 23/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);
    }
}

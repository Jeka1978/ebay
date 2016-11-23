package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by Evegeny on 23/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.close();
    }
}

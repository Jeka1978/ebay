package screensaver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 23/11/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("screensaver");
        while (true) {
            ColorFrame colorFrame = context.getBean(ColorFrame.class);
            Thread.sleep(70);
            colorFrame.fly();

        }
    }
}

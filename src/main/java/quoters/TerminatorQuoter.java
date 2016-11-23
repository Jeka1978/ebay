package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;

import javax.annotation.PreDestroy;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 23/11/2016.
 */
public class TerminatorQuoter implements Quoter {

    @Setter
    private List<String> messages;

    @Value("${terminator}")
    private void kaki(String[] messages,@Value("${JAVA_HOME}") String javaHome) {
        this.messages = Arrays.asList(messages);
    }

    @PreDestroy
    public void killAll(){
        System.out.println("You are terminated");
    }

    @Override
    public void sayQuote() {
       messages.forEach(System.out::println);

    }
}


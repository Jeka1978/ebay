package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Component("3")
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        return "happy birthday!!!";
    }
}

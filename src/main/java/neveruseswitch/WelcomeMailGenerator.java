package neveruseswitch;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Component("1")
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        //50 lines code
        return "<html>welcome</html>";
    }
}

package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Component("2")
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        //50 lines code
        return "<html>don't call us we call you</html>";
    }
}

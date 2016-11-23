package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 23/11/2016.
 */

@Setter
@Component
@Order(2)
public class ShakespearQuoter implements Quoter {
    @Value("${shake}")
    private String message;

    @InjectRandomInt(min = 2, max = 5)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}






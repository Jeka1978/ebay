package quoters;

import lombok.Setter;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Setter
public class TalkingRobotImpl implements TalkingRobot {
    private List<Quoter> quoters;
    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}

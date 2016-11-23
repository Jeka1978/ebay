package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Service
public class MailSender {
    @Autowired
    private Map<String,MailGenerator> map;

    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail(){
        String mailCode = String.valueOf(MailUtil.getMailCode());
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new RuntimeException(mailCode + " not supported yet");
        }
        String mail = mailGenerator.generateBody();
        send(mail);
    }

    private void send(String welcome) {
        System.out.println("Sending... "+welcome);
    }
}

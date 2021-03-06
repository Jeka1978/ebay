package quoters.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Component
@EnableAspectJAutoProxy
@Aspect
public class QuoterAspect {

    @Before("execution(* quoters..*.say*(..))")
    public void handleQuoteMethods() {
        System.out.print("this is qoute: ");
    }
}

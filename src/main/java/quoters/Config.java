package quoters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Configuration
@PropertySource("classpath:quotes.properties")
@ComponentScan(basePackages = "quoters")
@EnableScheduling
public class Config {
}

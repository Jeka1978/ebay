package screensaver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.awt.*;
import java.util.Random;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Configuration
public class ScreenSaverConfig {
    private Random random= new Random();

    @Bean
    public ColorFrame colorFrame(){
        return new ColorFrame() {
            @Override
            protected Color getColorBean() {
                return color();
            }
        };
    }
    @Bean
    @Scope(value = "prototype")
    public Color color(){
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }
}

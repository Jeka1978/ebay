package screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Component
public class ColorFrame extends JFrame {

    @Autowired
    private Color color;
    private Random random= new Random();

    @PostConstruct
    private void init(){
        setSize(200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        System.out.println(color.getClass());
        System.out.println(color);
        System.out.println(color);
        System.out.println(color);
        System.out.println(color);
        System.out.println(color);
        System.out.println(color);
        System.out.println(color);
    }

    public void fly() {
        setLocation(random.nextInt(1200),random.nextInt(900));
        getContentPane().setBackground(color);
        repaint();
    }

}

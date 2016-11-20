package tdd;

import myspring.IRobot;

/**
 * Created by Evegeny on 20/11/2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        TestRunner.runAllTestMethods(MyTest.class);
        IRobot iRobot = new IRobot();
    }
}

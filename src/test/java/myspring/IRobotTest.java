package myspring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 20/11/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class IRobotTest {
    @Mock
    private Cleaner cleaner;
    @Mock
    private Speaker speaker;

    @InjectMocks
    private IRobot iRobot;

    @Test
    public void cleanRoom() throws Exception {
       iRobot.cleanRoom();


    }

}
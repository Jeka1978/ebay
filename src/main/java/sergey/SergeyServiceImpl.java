package sergey;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 23/11/2016.
 */
@Service
@Scope("prototype")
public class SergeyServiceImpl implements SergeyService {
    @Override
    public void work() {

    }
}

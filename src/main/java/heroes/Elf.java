package heroes;

import lombok.ToString;

/**
 * Created by Evegeny on 20/11/2016.
 */
@ToString
public class Elf {
    @InjectRandomName
    private String name;
}

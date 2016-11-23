package annotations.examples;/**
 * Created by Evegeny on 23/11/2016.
 */

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Qualifier
public @interface MySql {
}

package cs236703.spring2015.hw4.solution;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;


@Retention(RetentionPolicy.RUNTIME)
@Target( ElementType.TYPE)
public @interface OOPTestClass {

	boolean value();

}

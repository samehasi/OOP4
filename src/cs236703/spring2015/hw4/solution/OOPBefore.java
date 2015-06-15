/**
 * 
 */
package cs236703.spring2015.hw4.solution;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * @author SAMEH
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( ElementType.METHOD)
public @interface OOPBefore {

	String[] value();

}

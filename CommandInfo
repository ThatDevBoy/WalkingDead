import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CommandInfo {

	String description();
	String usage();
	String[] aliases();
	boolean op(); // If true, only an operator can run this command.
	
	//We can this class to a command to add info on how to use command
	
}

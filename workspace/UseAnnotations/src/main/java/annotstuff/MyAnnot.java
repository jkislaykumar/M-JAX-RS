package annotstuff;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@Target(value={ElementType.TYPE, ElementType.FIELD})
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface MyAnnot {
	String value();
	String [] kids() default {};
	String name() default "Freddy";
}

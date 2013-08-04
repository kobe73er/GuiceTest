package annotationTest;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)//这里的RetentionPolicy可以有RUNTIME，CLASS，FIELD三种选择
@Target(ElementType.FIELD)
public @interface Kitto {
	String value() default "kitto";
}
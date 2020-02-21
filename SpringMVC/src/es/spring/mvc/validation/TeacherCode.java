package es.spring.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = TeacherCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TeacherCode {
	// define default course code
	public String value() default "MPR";

	// define default error message
	public String message() default "must start with MPR";
	
	// define default groups
	public Class<?>[] groups() default{};
	
	// define default payloads
	public Class<? extends Payload>[] payload() default{};
}

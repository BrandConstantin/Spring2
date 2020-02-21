package es.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TeacherCodeConstraintValidator implements ConstraintValidator<TeacherCode, String> {
	private String teacherPrefix;
	
	@Override
	public void initialize(TeacherCode theTeacherCode) {
		teacherPrefix = theTeacherCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result;
		
		if(theCode != null) {
			result = theCode.startsWith(teacherPrefix);	
		}else {
			result = true;
		}
				
		return result;
	}

}

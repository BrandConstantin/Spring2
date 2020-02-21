package es.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Teacher {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	@NotNull(message="This input is required")
	@Size(min=3, message="This input is required and need at last 3 characters")
	public String getLastName() {
		return lastName;
	}
	
	@NotNull(message="This input is required urgently")
	@Min(value=0, message="The min number can't be less to 0")
	@Max(value=10, message="The max number can't be greater to 10")
	private Integer numberStudents;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Only 5 chars/digits accepted")
	private String teacherCode;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getNumberStudents() {
		return numberStudents;
	}

	public void setNumberStudents(Integer numberStudents) {
		this.numberStudents = numberStudents;
	}

	public String getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}
		
}

package es.spring.mvc;

import javax.validation.constraints.NotNull;
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
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

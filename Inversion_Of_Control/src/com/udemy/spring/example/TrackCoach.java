package com.udemy.spring.example;

public class TrackCoach implements Coach {	

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

	// add an init method
	public void doMyStartupStuff() {
		System.out.println("Inside the method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanStuff() {
		System.out.println("Clean the method with doMyCleanStuff");		
	}
}

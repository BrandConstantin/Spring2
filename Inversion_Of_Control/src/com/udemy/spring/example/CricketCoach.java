package com.udemy.spring.example;

public class CricketCoach implements Coach {
	private FortuneService fortuneServ;
	
	// add new fields
	private String emailAddress;
	private String team;	

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Set email");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Set team");
		this.team = team;
	}

	// create no-arg constructor
	public CricketCoach() {
		System.out.println("Inside no-arg constructor");
	}

	public void setFortuneServ(FortuneService fortuneServ) {
		System.out.println("Inside setter method");
		this.fortuneServ = fortuneServ;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServ.getFortune();
	}
}

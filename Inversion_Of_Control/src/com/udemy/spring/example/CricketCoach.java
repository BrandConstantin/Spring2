package com.udemy.spring.example;

public class CricketCoach implements Coach {
	private FortuneService fortuneServ;

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

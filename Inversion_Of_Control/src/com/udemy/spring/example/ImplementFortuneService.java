package com.udemy.spring.example;

public class ImplementFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is you lucky day!";
	}

}

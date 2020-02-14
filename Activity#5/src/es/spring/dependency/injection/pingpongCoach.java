package es.spring.dependency.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class pingpongCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Practice pingpong";
	}

	@Override
	public String getDaylyFortune() {
		return fortuneService.getFortune();
	}

	// define a default constructor
	public pingpongCoach() {
		System.out.println(">> inside default constructor");
	}
}

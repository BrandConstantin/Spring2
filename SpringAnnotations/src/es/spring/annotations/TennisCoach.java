package es.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //use the default bean because we don't specify one
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDaylyFortune() {
		return fortuneService.getFortune();
	}

//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		this.fortuneService = theFortuneService;
//	}

	// define a default constructor
	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}
	
//	// define a setter method
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println(">> inside setFortuneService methdo");
//		this.fortuneService = theFortuneService;
//	}
}

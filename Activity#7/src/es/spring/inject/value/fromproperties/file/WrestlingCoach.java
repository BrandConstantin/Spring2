package es.spring.inject.value.fromproperties.file;

import org.springframework.stereotype.Component;

@Component
public class WrestlingCoach implements Coach{
	private FortuneService fortuneService;
	public WrestlingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "wrestling";
	}

	@Override
	public String getDaylyFortune() {
		return "it's not a sport";
	}

}

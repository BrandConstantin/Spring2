package activity3.beanScopes.andLifecycle;

import activity3.beanScopes.andLifecycle.FortuneService;

public class OtherCoach implements Coach {
	private FortuneService fortuneServ;	

	public OtherCoach(FortuneService fortuneServ) {
		this.fortuneServ = fortuneServ;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 2k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServ.getFortune();
	}

}

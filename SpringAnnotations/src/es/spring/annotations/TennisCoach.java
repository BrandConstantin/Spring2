package es.spring.annotations;

import org.springframework.stereotype.Component;

@Component //use the default bean because we don't specify one
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}

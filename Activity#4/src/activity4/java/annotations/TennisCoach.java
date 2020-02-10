package activity4.java.annotations;

import org.springframework.stereotype.Component;

@Component("firstCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "I\'m the first coach!";
	}

}

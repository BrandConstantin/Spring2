package activity4.java.annotations;

import org.springframework.stereotype.Component;

@Component
public class VolleyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "I\'m the second coach!";
	}

}

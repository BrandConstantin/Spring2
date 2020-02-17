package es.spring.inject.value.fromproperties.file;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class SportConfig {
	// define bean for service
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}	
	// define bean for inject dependency
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach wrestlingCoach() {
		WrestlingCoach myWrestlingCoach = new WrestlingCoach(happyFortuneService());
		
		return myWrestlingCoach;
	}
}

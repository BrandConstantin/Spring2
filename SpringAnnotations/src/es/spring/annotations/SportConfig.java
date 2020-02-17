package es.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("es.spring.annotations")
public class SportConfig {
	// define bean for service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}	
	// define bean for inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}

package es.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("es.spring.annotations")
@PropertySource("classpath:sport.properties")
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

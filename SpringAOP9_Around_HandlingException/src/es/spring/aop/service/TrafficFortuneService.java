package es.spring.aop.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	public String getFortune() {
		// simulate a delay
		try {
			TimeUnit.SECONDS.sleep(7);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// return a fortune
		return "Expect a lot of traffic";
	}

	public String getFortune(boolean tripWire) {
		if(tripWire) {
			throw new RuntimeException("Highway is closed");
		}
		return getFortune();
	}
}

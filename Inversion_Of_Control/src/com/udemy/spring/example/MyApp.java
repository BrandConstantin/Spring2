package com.udemy.spring.example;

public class MyApp {

	public static void main(String[] args) {
		//create the object
		Coach theCoach = new BaseballCoach();
		Coach theCoach2 = new TrackCoach();
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
	}

}

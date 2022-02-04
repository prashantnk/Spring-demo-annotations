package com.springdemo.javaAnnotations.coach;

import org.springframework.stereotype.Component;

@Component
public class ProgrammingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Solve 3 cf problems !";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}

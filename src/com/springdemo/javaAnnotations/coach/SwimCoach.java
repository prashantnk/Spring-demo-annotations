package com.springdemo.javaAnnotations.coach;

import org.springframework.beans.factory.annotation.Value;

import com.springdemo.javaAnnotations.services.FortuneService;

public class SwimCoach implements Coach {
	FortuneService myFS;
	@Value("${email}")
	private String email;
	@Value("${team}")
	private String team;

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService FS) {
		myFS = FS;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 mtrs.";
	}

	@Override
	public String getDailyFortune() {
		return myFS.getFortune();
	}

}

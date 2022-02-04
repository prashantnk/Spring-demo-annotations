package com.springdemo.javaAnnotations.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springdemo.javaAnnotations.services.FortuneService;

//@Component("tennisCoach") -> explicit provision of Bean ID
@Component
// default Bean ID , same name but first letter lower-case == tennisCoach
public class TennisCoach implements Coach {
	private FortuneService myFortuneService;

	@Autowired
	public TennisCoach(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do Fast Feet for 30 secs.";
	}

	@Override
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}
}

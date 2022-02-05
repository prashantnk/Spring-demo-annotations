package com.springdemo.javaAnnotations.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springdemo.javaAnnotations.services.FortuneService;

@Component
public class ProgrammingCoach implements Coach {
//	Field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService myFS;

//	setter injection
//	@Autowired
//	public void setFortuneService(@Qualifier("happyFortuneService") FortuneService FS) {
//		System.out.println("ProgrammingCoach : in setFortuneService");
//		myFS = FS;
//	}

//	method injection
//	@Autowired
//	public void setMyFS(@Qualifier("happyFortuneService") FortuneService FS) {
//		System.out.println("ProgrammingCoach : in setMYFS");
//		myFS = FS;
//	}

	@Override
	public String getDailyWorkout() {
		return "Solve 3 cf problems !";
	}

	@Override
	public String getDailyFortune() {
		return myFS.getFortune();
	}

}

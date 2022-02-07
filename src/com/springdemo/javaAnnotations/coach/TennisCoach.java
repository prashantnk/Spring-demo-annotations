package com.springdemo.javaAnnotations.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.springdemo.javaAnnotations.services.FortuneService;

@PropertySource("classpath:data.properties")
//@Component("tennisCoach") -> explicit provision of Bean ID
@Component
// default Bean ID , same name but first letter lower-case == tennisCoach
public class TennisCoach implements Coach {
	@Value("${id}")
	private int id;

	public TennisCoach() {
		System.out.println("TennisCoach Constructor : id is = " + id);
//		constructor runs before any spring operations
	}

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService myFortuneService;

//	@Autowired
//	public TennisCoach(@Qualifier("happyFortuneService") FortuneService myFortuneService) {
//		this.myFortuneService = myFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Do Fast Feet for 30 secs.";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("TennisCoach getDailyFortune : id is = " + id);
		return myFortuneService.getFortune();
	}
}

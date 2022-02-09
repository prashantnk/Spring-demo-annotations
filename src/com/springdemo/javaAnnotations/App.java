package com.springdemo.javaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.javaAnnotations.coach.Coach;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		Coach TCoach = context.getBean("tennisCoach", Coach.class);
		Coach PCoach = context.getBean("programmingCoach", Coach.class);
//		TestCoach testCoach = context.getBean("testCoach", TestCoach.class);

//		System.out.println(TCoach.getDailyWorkout());
//		System.out.println(TCoach.getDailyFortune());
		System.out.println(PCoach.getDailyWorkout());
		System.out.println(PCoach.getDailyFortune());

//		testCoach.check();

		context.close();

	}

}

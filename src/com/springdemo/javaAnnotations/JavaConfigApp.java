package com.springdemo.javaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.javaAnnotations.coach.Coach;
import com.springdemo.javaAnnotations.coach.SwimCoach;

public class JavaConfigApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		Coach programmingCoach = context.getBean("programmingCoach", Coach.class);
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(programmingCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println("Email : " + swimCoach.getEmail());
		System.out.println("team : " + swimCoach.getTeam());

		context.close();

	}

}

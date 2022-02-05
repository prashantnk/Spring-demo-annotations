package com.springdemo.javaAnnotations.coach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:fortunes.properties")
@Component
public class TestCoach implements Coach {
	@Value("${fortunes}")
	private String[] temp;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	public void check() {
		System.out.println("temp is : " + temp);
		for (var x : temp)
			System.out.println(x);
	}

}

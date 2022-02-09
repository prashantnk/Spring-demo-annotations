package com.springdemo.javaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springdemo.javaAnnotations.coach.Coach;
import com.springdemo.javaAnnotations.coach.SwimCoach;
import com.springdemo.javaAnnotations.services.FortuneService;
import com.springdemo.javaAnnotations.services.SadFortuneService;

@Configuration
@PropertySource("classpath:data.properties")
@ComponentScan("com.springdemo.javaAnnotations")
public class SportConfig {
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
		return mySwimCoach;
	}
}

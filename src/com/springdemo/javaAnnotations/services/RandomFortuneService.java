package com.springdemo.javaAnnotations.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:fortunes.properties")
@Component
public class RandomFortuneService implements FortuneService {
	@Value("${fortunes}")
	private String[] fortunes;
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortunes.length);
		return fortunes[index];
	}

}

package com.springdemo.javaAnnotations.services;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You will be rich today!";
	}

}

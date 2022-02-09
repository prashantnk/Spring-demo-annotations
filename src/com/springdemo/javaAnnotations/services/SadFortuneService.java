package com.springdemo.javaAnnotations.services;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today you will lose 1000rs!";
	}

}

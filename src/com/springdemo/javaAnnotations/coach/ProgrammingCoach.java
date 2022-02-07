package com.springdemo.javaAnnotations.coach;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springdemo.javaAnnotations.services.FortuneService;

@Component
//@Scope("prototype")
public class ProgrammingCoach implements Coach, DisposableBean {
//	Field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService myFS;

	@Override
	public String getDailyWorkout() {
		return "Solve 3 cf problems !";
	}

	@Override
	public String getDailyFortune() {
		return myFS.getFortune();
	}

	@PostConstruct
	public void myInit() {
		System.out.println("In My Init progrmming coach");
	}

//	@PreDestroy
//	public void myDestroy() {
//		System.out.println("In My Destroy progrmming coach");
//	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("In My Destroy progrmming coach that implements disposable bean interface");

	}

}

//setter injection
//@Autowired
//public void setFortuneService(@Qualifier("happyFortuneService") FortuneService FS) {
//	System.out.println("ProgrammingCoach : in setFortuneService");
//	myFS = FS;
//}

//method injection
//@Autowired
//public void setMyFS(@Qualifier("happyFortuneService") FortuneService FS) {
//	System.out.println("ProgrammingCoach : in setMYFS");
//	myFS = FS;
//}

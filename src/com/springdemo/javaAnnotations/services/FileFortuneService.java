package com.springdemo.javaAnnotations.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> fortunes;

	public FileFortuneService() {
		fortunes = new ArrayList<String>();
	}

	@PostConstruct
	public void buildFortunes() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("src/fortunes.txt"));
		String now = br.readLine();
		while (now != null) {
			fortunes.add(now);
			now = br.readLine();
		}
		br.close();
	}

	@Override
	public String getFortune() {
		int index = new Random().nextInt(fortunes.size());
		return fortunes.get(index);
	}

}

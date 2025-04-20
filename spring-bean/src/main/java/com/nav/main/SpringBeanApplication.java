package com.nav.main;

import com.nav.main.service.FirstService;
import com.nav.main.service.Hello;
import com.nav.main.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import outer.BasicCalculation;
import outer.OuterService;

@SpringBootApplication
public class SpringBeanApplication implements CommandLineRunner {
	@Autowired
	FirstService firstService;

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	SecondService secondService;

	@Autowired
	Hello helloInHindi;

	@Autowired
	Hello helloInEnglish;

	@Autowired
	OuterService outerService;

	@Autowired
	BasicCalculation basicCalculation;

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(basicCalculation.add(10,20,50,100,300,399));

	}
}

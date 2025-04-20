package com.nav.main;

import com.nav.main.service.FirstService;
import com.nav.main.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBeanApplication implements CommandLineRunner {
	@Autowired
	FirstService firstService;

	@Autowired
	SecondService secondService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(firstService);
	}
}

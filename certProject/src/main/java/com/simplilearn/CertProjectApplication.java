package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.simplilearn.*"})
public class CertProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertProjectApplication.class, args);
	}

}

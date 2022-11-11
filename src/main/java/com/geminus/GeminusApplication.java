package com.geminus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.geminus.controllers.Challenge;

@SpringBootApplication
public class GeminusApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeminusApplication.class, args);

		Challenge.caso1();
		Challenge.caso2();
		Challenge.caso3();
	}

}

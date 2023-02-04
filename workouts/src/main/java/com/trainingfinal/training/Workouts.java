package com.trainingfinal.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.trainingfinal.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class})
public class Workouts extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Workouts.class, args);
	}
}

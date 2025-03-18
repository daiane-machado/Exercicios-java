package com.example.exercicios_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.exercicios_java.semana1.negocio","com.example.exercicios_java.semana1.service","com.example.exercicios_java.semana1.controller"})
public class ExerciciosJavaApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ExerciciosJavaApplication.class, args);
	}

}

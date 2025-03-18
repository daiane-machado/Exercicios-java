package com.example.exercicios_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.exercicios_java.semana1.negocio","com.example.exercicios_java.semana1.services","com.example.exercicios_java.semana1.controlle"})
public class ExerciciosJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosJavaApplication.class, args);r
	}

}

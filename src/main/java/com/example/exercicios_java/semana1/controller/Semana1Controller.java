package com.example.exercicios_java.semana1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/semana1")
public class Semana1Controller {

    private final Semana1Service semana1Service;

    public Semana1Controller(Semana1Service semana1Service){
        this.semana1Service = semana1Service;
    }
    
    @GetMapping("/ex1")
    public String ex1()  {
        return semana1Service.ex1();
    }
    
}

package com.example.exercicios_java.semana1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/semana1")
public class Semana1Controller {

    @Autowired
    private final Semana1Service semana1Service;
    
    @GetMapping("/ex1")
    public String ex1()  {
        return semana1Service.ex1Hello();
    }
    
}

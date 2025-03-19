package com.example.exercicios_java.semana1.controller;

import org.springframework.web.bind.annotation.*;
import com.example.exercicios_java.semana1.service.Semana1Service;

@RestController
@RequestMapping(value = "/semana1")
public class Semana1Controller {

    private final Semana1Service semana1Service;

    public Semana1Controller(Semana1Service semana1Service){
        this.semana1Service = semana1Service;
    }
    
    @GetMapping("/ex1")
    public String ex1()  {
        return semana1Service.ex1Hello();
    }

    @GetMapping("/ex2")
    public String ex2(@RequestParan double num1, @RequestParan double num2,@RequestParan String operador){
        return semana1Service.ex2Calculadora(double num1, double num2, String operador).toString();
    }
    
}

package com.example.exercicios_java.semana1.controller;

import org.springframework.stereotype.Service;

@Service
public class Semana1Service{

    private Ex1 ex1;

    public String ex1(){
        return Ex1.imprimeHello();
    }
}
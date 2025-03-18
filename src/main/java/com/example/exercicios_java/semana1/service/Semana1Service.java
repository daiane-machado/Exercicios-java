package com.example.exercicios_java.semana1.controller;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class Semana1Service{

    @Autowired
    private Ex1 ex1;

    public String ex1(){
        return ex1.imprimeHello();
    }
}
package com.example.exercicios_java.semana1.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class Semana1Service{

    @Autowired
    private Ex1 ex1;

    public String ex1Hello(){
        return ex1.imprimeHello();
    }
}
package com.example.exercicios_java.semana1.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class Semana1Service{

    private final Ex1Negocio ex1Negocio;

    @Autowired
    public Semana1Service(Ex1Negocio ex1Negocio){
        this.ex1Negocio;
    }
    public String ex1Hello(){
        return ex1Negocio.imprimeHello();
    }
}

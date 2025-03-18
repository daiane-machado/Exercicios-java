package com.example.exercicios_java.semana1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.exercicios_java.semana1.negocio.Ex1Negocio;



@Service
public class Semana1Service{

   @Autowired
    private Ex1Hello ex1Hello;

    public String ex1Hello(){
        return ex1Hello.imprimeHello();
    }
}

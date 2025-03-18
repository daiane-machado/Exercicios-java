package com.example.exercicios_java.semana1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.exercicios_java.semana1.negocio.Ex1Negocio;



@Service
public class Semana1Service{

   
    private final Ex1Negocio ex1Negocio;
public Semana1Service(Ex1Negocio ex1Negocio){
    this.ex1Negocio = ex1Negocio;
}
    public String ex1Hello(){
        return ex1Negocio.imprimeHello();
    }
}

package com.example.exercicios_java.semana1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.exercicios_java.semana1.negocio.Ex1Hello;
import com.example.exercicios_java.semana1.negocio.Ex2Calculadora;



@Service
public class Semana1Service{

   @Autowired
    private Ex1Hello ex1Hello;

   @Autowired
    private Ex2Calculadora ex2Calculadora;

    public String ex1Hello(){
        return ex1Hello.imprimeHello();
    }

    public <T> ex2Calculadora(double num1, double num2, String operador){
        return ex2Calculadora.calcula(double num1, double num2, String operador);
    }
}

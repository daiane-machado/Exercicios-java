package com.example.exercicios_java.semana1.controller;

import  com.example.exercicios_java.semana1.negocio.Ex1;

@Service
public class Semana1Service{

    private Ex1 ex1;

    public String ex1(){
        return Ex1.imprimeHello();
    }
}
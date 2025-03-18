package com.example.exercicios_java.semana1.negocio;

import org.springframework.stereotype.Component;

@Component
public class Ex1Negocio {
    
   public String imprimeHello(){
      System.out.println("Teste");
    return "Hello wolrd!";
   }
    
}

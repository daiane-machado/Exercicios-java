package com.example.exercicios_java.semana1.negocio;

import org.springframework.stereotype.Component;

@Component
public class Ex2Calculadora{

    public <T> calcula(double num1, double num2, String operador){
        Switch(operador){
            case "+":   
                soma(double num1, double num2);
            breack;
            case "-":
                subtrai(double num1, double num2);
                breack;
            case "x":
                multiplica(double num1, double num2);
                breack;
            case "/":
                divide(double num1, double num2);
                breack;
            default:
                return "Entrada inválida" ;    
                
                
                 }
   }

}

public double soma(double num1, double num2){
    return num1 + num2;
}
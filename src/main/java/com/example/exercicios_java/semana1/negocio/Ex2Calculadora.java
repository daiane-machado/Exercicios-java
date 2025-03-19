package com.example.exercicios_java.semana1.negocio;

import org.springframework.stereotype.Component;

@Component
public class Ex2Calculadora{

    public static <T extends Number> double calcula(T num1, T num2, String operador){
        switch(operador){
            case "+":   
                soma(double num1, double num2);
            break;
            case "-":
                subtrai(double num1, double num2);
                break;
            case "x":
                multiplica(double num1, double num2);
                break;
            case "/":
                divide(double num1, double  num2);
                break;
            default:
                return "Entrada inválida";
                break;                    
                 }
   }

}

publice double soma(double num1,double num2){
    return (num1 + num2);
}
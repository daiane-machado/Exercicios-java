package com.example.exercicios_java.semana1.negocio;

import org.springframework.stereotype.Component;

@Component
public class Ex2Calculadora{

    public <T> calcula(double num1, double num2, String operador){
        Switch(operador){
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
                divide(double num1, double num2);
                break;
            default:
                return "Entrada inválida";
                break;                    
                 }
   }

}

public double soma(double num1, double num2){
    return num1 + num2;
}
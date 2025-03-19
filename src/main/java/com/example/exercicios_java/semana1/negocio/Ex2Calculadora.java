package com.example.exercicios_java.semana1.negocio;

import org.springframework.stereotype.Component;

@Component
public class Ex2Calculadora{

    public <T> T calcula(T num1, T num2, String operador){
        Switch(operador){
            case "+":   
                soma(T num1, T num2);
            break;
            case "-":
                subtrai(T num1, double num2);
                break;
            case "x":
                multiplica(T num1, T num2);
                break;
            case "/":
                divide(T num1, T num2);
                break;
            default:
                return "Entrada inválida";
                break;                    
                 }
   }

}

public <T> T soma(T num1, T num2){
    return (num1 + num2);
}
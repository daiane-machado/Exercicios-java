package com.example.exercicios_java.semmana1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Ex1 {
    
    @GetMapping
    public String getHellk()  {
        return "Opa, to no ar!";
    }
    
}

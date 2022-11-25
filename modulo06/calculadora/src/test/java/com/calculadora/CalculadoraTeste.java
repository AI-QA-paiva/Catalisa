package com.calculadora;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculadoraTeste {

    @Test
    void somaValores(){
        Calculadora cal = new Calculadora(); //criando um objeto
        float soma = cal.somar(100,200); //informando o que desejo testar em parametro
        Assertions.assertEquals(300,soma);

    }

}

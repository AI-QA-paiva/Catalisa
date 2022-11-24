package Modulo3.lista05.parte2.exer02quadrado;

import java.util.Scanner;

public class Quadrado {
    double lado;

    public Quadrado(){
        this.lado = lado;

        System.out.println("");

    }


    public Quadrado(double lado){
        this.lado = lado;

    }
    public void mudarValorLado(){
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque um novo valor do lado: ");
        this.lado = input.nextDouble();
        System.out.println(this.lado);


    }public double retornarValorLado(){
        return lado;
    }



}

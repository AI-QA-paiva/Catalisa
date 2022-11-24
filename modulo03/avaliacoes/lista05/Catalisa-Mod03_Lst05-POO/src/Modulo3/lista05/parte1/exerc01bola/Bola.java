package Modulo3.lista05.parte1.exerc01bola;

import java.util.Scanner;

public class Bola {

    String marca, cor;
    int circunferencia;
    int velocidade;


    public Bola(String marca, String cor, int circunferencia, int velocidade) {
        this.marca = marca;
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.velocidade = velocidade;
    }


    public String mostraCor( String cor){
        return cor;
    }

    public void trocandoCor(){
        Scanner cores = new Scanner(System.in);
        System.out.println("Coloque a cor");
        cor=cores.next();
        System.out.println("A cor da sua bola agora é " + cor);
    }


}

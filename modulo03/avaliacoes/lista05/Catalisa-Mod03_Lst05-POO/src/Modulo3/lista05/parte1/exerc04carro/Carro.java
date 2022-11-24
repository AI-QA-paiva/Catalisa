package Modulo3.lista05.parte1.exerc04carro;

import java.util.Scanner;

public class Carro {

    Scanner caracteristica = new Scanner(System.in);
    int qtdPortas;
    String modelo;
    String marca;
    double potencia;
    Boolean ligarCarro;

    public Carro () {
        this.qtdPortas = qtdPortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0; // BOA PRATICA POR O VALOR CHAPADO DENTRO DO METODO;
        this.ligarCarro = false;

    }

    public void seuCarro () {
        System.out.println();
        System.out.print("Informe qual a marca de seu carro: ");
        marca = caracteristica.next();
        System.out.print("Informe qual a modelo de seu carro: ");
        modelo = caracteristica.next();
        System.out.print("Informe qual a potência de seu carro: ");
        potencia = caracteristica.nextDouble();
        System.out.print("Informe quantas portas tem seu carro: ");
        qtdPortas = caracteristica.nextInt();

        System.out.println();
        System.out.println("Seu carro é da marca "+marca);
        System.out.println("Seu carro é da marca "+modelo);
        System.out.println("Seu carro é da marca "+potencia);
        System.out.println("Seu carro é da marca "+qtdPortas);


    }

    public void ligarCarro() {
        this.ligarCarro = true;
        System.out.println("O carro está " + ligarCarro);

    }


}

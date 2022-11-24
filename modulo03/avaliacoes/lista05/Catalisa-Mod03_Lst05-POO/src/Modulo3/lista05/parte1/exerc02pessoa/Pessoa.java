package Modulo3.lista05.parte1.exerc02pessoa;

import java.util.Scanner;

public class Pessoa {

    Scanner dados = new Scanner(System.in);
    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa() {
        this.nome = nome;
        this.idade = idade;
        this.peso = 0;
        this.altura = altura;

    }

    public void apresenteVoce(){
        System.out.println();
        System.out.print("Informe seu nome: ");
        nome = dados.next();
        System.out.print("Informe a sua idade: ");
        idade = dados.nextInt();
        System.out.print("Informe o seu peso: ");
        peso = dados.nextDouble();
        System.out.print("Informe a sua altura: ");
        altura = dados.nextDouble();

        System.out.println("seu nome é: "+nome);
        System.out.println("sua idade é: "+idade);
        System.out.println("o seu peso é: "+peso);
        System.out.println("a sua altura é: "+altura);


    }

    public void crescerComo () {
        if(this.idade < 21) {
            System.out.println("Para verificar o seu crescimento, por favor informe a sua idade? ");
            idade=dados.nextInt();
            double totalCrescimento = 0;
            double crescer = 0.05;
            totalCrescimento = idade * crescer;

            System.out.printf("você cresceu %.2f ",totalCrescimento);


        } else {
            System.out.println("Voce não cresce mais!!");

        }

    }

    public void envelhecer () {
        System.out.println("você envelheceu "+idade+" anos");
        //return = idade;

    }

    public void emagrecer () {
        System.out.println("você emagrecer "+peso+" quilos");
        //return = peso;

    }

    public void engordar () {
        System.out.println("você engordou "+peso+" quilos");
        //return = peso;

    }


}

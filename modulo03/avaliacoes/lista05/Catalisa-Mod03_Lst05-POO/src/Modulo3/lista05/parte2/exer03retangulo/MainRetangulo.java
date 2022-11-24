package Modulo3.lista05.parte2.exer03retangulo;

import java.util.Scanner;

public class MainRetangulo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Retangulo r1 = new Retangulo();
        double ladoA = r1.ladoA;
        double ladoB = r1.ladoB;

        System.out.println("Coloque o valor do ladoA");
        ladoA = input.nextDouble();
        System.out.println("Coloque o valor do ladoB");
        ladoB = input.nextDouble();

        System.out.println("Valor de A = " + ladoA );
        System.out.println("Valor de B = " + ladoB );

        System.out.println("Deseja alterar o valor dos lados : S/N ");
        String usuario = input.next();


        if (usuario.equalsIgnoreCase("S")){
            System.out.println(" Novo valor de lado A ");
            ladoA = input.nextDouble();
            System.out.println(" Novo valor do lado B ");
            ladoB = input.nextDouble();
            r1.alteraValorLados( ladoA, ladoB );
        } else {

        }

        r1.mostrarLados();

        double calculo = r1.calculoArea();
        System.out.println(" Valor calculo = " + calculo);

        double perimetro = r1.calcularPerimetro();
        System.out.println("Calculo do perimetro = " + perimetro);


    }


}

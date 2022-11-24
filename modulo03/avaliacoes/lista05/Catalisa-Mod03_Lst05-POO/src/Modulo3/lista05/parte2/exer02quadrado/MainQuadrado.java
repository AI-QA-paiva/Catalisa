package Modulo3.lista05.parte2.exer02quadrado;

import java.util.Scanner;

public class MainQuadrado {

    public static void main(String[] args) {

        Quadrado q =new Quadrado();
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o valor do lado ?");
        q.lado = input.nextDouble();

        System.out.println(q.lado);

        System.out.println("Deseja mudar de lado ? = S/N");
        String usuario = input.next();
        if (usuario.equalsIgnoreCase("S")){
            q.mudarValorLado();
        }else {
            System.out.println("Agradeço a preferência");

        }

    }

}

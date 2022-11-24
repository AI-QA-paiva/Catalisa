package Modulo3.lista05.parte1.exerc01bola;

import java.util.Scanner;

public class MainBola {

    public static void main(String[] args) {

        String trocar = null;
        Bola jabulani = new Bola("Addidas","azul",15,25);
        String cor = jabulani.cor;

        System.out.println();
        System.out.println("A marca da sua bola é "+jabulani.marca);
        System.out.println("A cor atual da sua bola é "+jabulani.mostraCor(cor));
        System.out.println("A circunferencia da bola é "+jabulani.circunferencia);
        System.out.println("A velocidade para esta bola é de "+jabulani.velocidade);
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Deseja trocar de cor? S/N");
        trocar=input.next();
        if(trocar.equalsIgnoreCase("S")){
            jabulani.trocandoCor();
            String novaCor = jabulani.cor;
        }else {
            System.out.println("Agradecemos a escolha");
        }

        System.out.println();
        System.out.println("A marca da sua bola é "+jabulani.marca);
        System.out.println("A cor atual da sua bola é "+jabulani.cor);
        System.out.println("A circunferencia da bola é "+jabulani.circunferencia);
        System.out.println("A velocidade para esta bola é de "+jabulani.velocidade);
        System.out.println();

    }
}

package Modulo3.lista05.parte1.exerc02pessoa;

import java.util.Scanner;

public class MainPessoa {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        p1.apresenteVoce();


        System.out.println("Deseja saber de seu crescimento? S/N");
        String usuario = dados.next();
        if(usuario.equalsIgnoreCase("s")){
            p1.crescerComo();
        }else{
            System.out.println("Ok, Agradecemos as informações prestadas");
        }

    }
}

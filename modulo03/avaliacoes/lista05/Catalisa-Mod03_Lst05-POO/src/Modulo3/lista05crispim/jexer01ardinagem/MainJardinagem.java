package Modulo3.lista05crispim.jexer01ardinagem;

import java.util.Scanner;

public class MainJardinagem {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        System.out.println();
        System.out.print("Informe quantos metros de grama necessita: ");
        int metrosGrama = dados.nextInt();
        dados.close();

        Jardinagem jardim = new Jardinagem(metrosGrama);
        System.out.println();
        System.out.println("Você precisará de adubo será de: "+jardim.usarAdubo()+" Kg");
        System.out.println("Pela quantidade calculada, o valor total do adubo será de R$ " + jardim.precoAdubo());
        System.out.println("O serviço para cortar a grama custaria R$ " + jardim.precoCorteGrama());
    }

}

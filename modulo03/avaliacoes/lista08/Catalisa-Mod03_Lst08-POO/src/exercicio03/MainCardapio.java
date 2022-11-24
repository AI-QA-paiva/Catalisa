package exercicio03;


import java.util.ArrayList;
import java.util.Scanner;

public class MainCardapio {

    public static void main(String[] args) {

        ArrayList<Prato> prato = new ArrayList<>();

        boolean c = true;

        Scanner opcoes = new Scanner(System.in);

        Prato tipo = new Prato(null, null);

        while (c == true) {
            System.out.println();
            System.out.println("Digite o que deseja fazer: ");
            System.out.println("1 = Adicionar Produto: ");
            System.out.println("2 = Exibir Lista Produtos: ");
            System.out.println("3 = Excluir Produto: ");
            System.out.println("4 = Encerrar o programa: ");

            int oQueEscolheu = opcoes.nextInt();

            switch (oQueEscolheu){
                case 1:
                    tipo.adicionarPrato();
                    break;

                case 2:
                    tipo.exibirPratos();
                    break;

                case 3:
                    tipo.excluirPrato();
                    break;

                case 4:
                    c = false;

                default:
                    System.out.println("Ação Inválida!");

            }
        }

    }

}

package exercicio02;

import java.util.Scanner;

public class MainVestibular {

    public static void main(String[] args) {

        boolean c = true;

        Scanner opcoes = new Scanner(System.in);
        //instanciar um objeto da classe Candidatos

        Candidato candidato = new Candidato(null,0);

        while(c == true){
            System.out.println();
            System.out.println("Para iniciar, Digite o que deseja fazer: ");
            System.out.println("1 = Adicionar Candidato: ");
            System.out.println("2 = Exibir Candidato: ");
            System.out.println("3 = Excluir Candidato: ");
            System.out.println("4 = Fechar programa");

            int oQueDigitou = opcoes.nextInt();

            switch (oQueDigitou){

                case 1:
                    candidato.adicionarCandidato();
                    break;
                case 2:
                    candidato.exibirCandidados();
                    break;
                case 3:
                    candidato.excluirCandidato();
                    break;
                case 4:
                    c = false;
                    break;

                default:
                    System.out.println("Escolha inválida");
            }

        }

    }

}

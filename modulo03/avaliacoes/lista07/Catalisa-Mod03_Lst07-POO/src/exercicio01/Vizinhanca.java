package exercicio01;

public class Vizinhanca {

    // o argumeto static, após public, me permite retirar o medoto abaixo de submissão a variavel objeto la da main;
    // isso faz com que eu puxe a classe Vizinhanca sem precisar puxar pelo objeto criado no main.

    public static void compoeVizinhanca (Pais p1, Pais p2) {
        p1.adicionarPaisContinente(p2);
        p2.adicionarPaisContinente(p1);

    }

}

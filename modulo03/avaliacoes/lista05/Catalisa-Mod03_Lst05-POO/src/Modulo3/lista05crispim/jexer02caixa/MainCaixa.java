package Modulo3.lista05crispim.jexer02caixa;

import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {

        Scanner Depositario = new Scanner(System.in);
        Caixa usuario = new Caixa();
        usuario.inicioConta();
        usuario.alteraConta();

    }


}

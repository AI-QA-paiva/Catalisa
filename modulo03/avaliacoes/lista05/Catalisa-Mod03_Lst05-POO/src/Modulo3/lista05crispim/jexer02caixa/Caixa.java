package Modulo3.lista05crispim.jexer02caixa;

import java.util.Scanner;

public class Caixa {

    Scanner bancario = new Scanner(System.in);
    String numConta, nomeCorrentista;
    double saldo;


    public Caixa() {
        this.numConta = numConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 1000;
    }


    public void inicioConta(){
        System.out.println();
        System.out.print("Informe a conta corrente: " );
        numConta = bancario.next();

        //System.out.print("Digite seu nome para cadastro !!! " );
        //nomeCorrentista = bancario.next();

        System.out.println("Seus dados são: ");
        //System.out.println("Nome: " +nomeCorrentista);
        System.out.println("Conta Corrente: " +numConta);

        System.out.println("Seu saldo atual é de R$ " +saldo);
    }

    public void creditoConta(){
        System.out.println("Digite o valor a ser depositado: ");
        double deposito = bancario.nextDouble();
        saldo +=deposito;
    }

    public void debitoConta(){
        System.out.println("Digite o valor a ser sacado: ");
        double saque = bancario.nextDouble();
        saldo -=saque;
    }

    public void alteraConta(){

        System.out.println("Deseja Depositar ou sacar ? ");
        System.out.println("1 - Depósito ");
        System.out.println("2 - Saque ");
        System.out.println("0 - para finalizar atendimento ");
        int respoUsuario = bancario.nextInt();
        if (respoUsuario == 1) {
            creditoConta();

            System.out.println("Saldo atualizado é: " +saldo);
            alteraConta();

        } else if(respoUsuario == 2){
            debitoConta();

            System.out.println("Saldo atualizado é: " +saldo);
            alteraConta();
        }else {
            System.out.println("Obrigado por utilizar nosso BANCO");
        }

    }


}

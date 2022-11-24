package exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {

    private String nomeProd;
    private double valorProd;

    Scanner item = new Scanner(System.in);

    ArrayList<Produto> listaProdutos = new ArrayList<>();

    //criando o construtor da classe produto e produto tem nome e preço/
    public Produto(String nomeProd, double valorProd) {
        this.nomeProd = nomeProd;
        this.valorProd = valorProd;
    }

    //criando metodos para uso em relaçoes entre classes //public Produto(){}
    public void adicionarProduto(){

        System.out.println("Informe o nome do produto a ser cadastrado: ");
        String nomeProd = item.next();//line

        System.out.println("Informe quanto custa este produto: R$ ");
        double valorProd = item.nextDouble();

        System.out.println("O Produto informado foi:\n"+nomeProd+", com o valor de R$ " + valorProd);
        System.out.println();
        Produto novoProduto = new Produto(nomeProd,valorProd);
                listaProdutos.add(novoProduto);

    }

    public void exibirProdutos(){

        System.out.println("A lista de produtos cadastrados contém o total de " + listaProdutos.size() + " item(s).");
        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println("Produto (" + listaProdutos.get(i).getNomeProd() + ") no valor de : R$ " + listaProdutos.get(i).getValorProd());

        }

    }

    public void excluirProduto(){

        System.out.println("Informe qual produto deseja excluir: ");

        exibirProdutos();

        String excluir = item.next();

        for (int i = 0; i < listaProdutos.size(); i++) {

            if (listaProdutos.get(i).getNomeProd().equals(excluir)) {
                listaProdutos.remove(i);
            }

        }

    }


    //criando todos os metodos get e setter

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getValorProd() {
        return valorProd;
    }

    public void setValorProd(double valorProd) {
        this.valorProd = valorProd;
    }


//    System.out.println("A informação está correta? Digite\n1 para confirmar cadastro do item:\n2 para corrigir cadastro do item: ");
//        int oQueInformou = item.nextInt();
//            if(oQueInformou ==1){
//                Produto novoProduto = new Produto(nomeProd,valorProd);
//                listaProdutos.add(novoProduto);
//
//            }else if(oQueInformou ==2){ //
//                System.out.println("Informe o nome do produto que quer inserir: ");
//                nomeProd = item.nextLine();
//
//                System.out.println("Informe quanto custa em R$ este produto: ");
//                valorProd = item.nextFloat();
//                Produto novoProduto = new Produto(nomeProd,valorProd);
//                listaProdutos.add(novoProduto);
//
//            }

//            switch (oQueInformou ==1){
//
//                case 1:
//                    Produto novoProduto = new Produto(nomeProd,valorProd);
//                    listaProdutos.add(novoProduto);
//                    break;
//
//                case 2:
//                    System.out.println("Informe o nome do produto que quer inserir: ");
//                    nomeProd = item.nextLine();
//
//                    System.out.println("Informe quanto custa em R$ este produto: ");
//                    valorProd = item.nextFloat();
//                    //Produto novoProduto = new Produto(nomeProd,valorProd);
//                   //listaProdutos.add(novoProduto);
//                    break;
//            }


}

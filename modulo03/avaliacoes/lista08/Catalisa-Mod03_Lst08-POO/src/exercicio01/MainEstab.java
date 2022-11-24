package exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEstab {

    public static void main(String[] args) {

//criando produtos com preço
        ArrayList<Produto> produto =new ArrayList<>();

        boolean c = true;

        Scanner opcoes = new Scanner(System.in);

        Produto prods = new Produto(null,0);

        while(c == true){
            System.out.println();
            System.out.println("Digite o que deseja fazer: ");
            System.out.println("1 = Adicionar Produto: ");
            System.out.println("2 = Exibir Lista Produtos: ");
            System.out.println("3 = Excluir Produto: ");
            System.out.println("4 = Encerrar o programa: ");

            int oQueEscolheu = opcoes.nextInt();

            switch (oQueEscolheu){

                case 1:
                    prods.adicionarProduto();
                    break;
                case 2:
                    prods.exibirProdutos();
                    break;
                case 3:
                    prods.excluirProduto();
                    break;
                case 4:
                    c = false;
                    break;

                default:
                    System.out.println("Escolha inválida");
            }

        }




























//        Produto produto0 = new Produto("maça",3.50);
//        Produto produto1 = new Produto("banana",4.50);
//        Produto produto2 = new Produto("laranja",5);
//        Produto produto3 = new Produto("tangerina",2.50);
//
//        produto.add(produto0);
//        produto.add(produto1);
//        produto.add(produto2);
//        produto.add(produto3);

        //produto.remove(0);
        //produto.size(produto[]);

//        for(Produto item: produto){ // forma de resposta vem cada nome por linha
//            System.out.println(item);
//        }



//        Produto nome1 = new Produto("maça", 3.50);
//        Produto nome2 = new Produto("laranja", 4);
//        Produto nome3 = new Produto("pera", 8);
//        Produto nome4 = new Produto("uva", 12.90);
//        Produto nome5 = new Produto("abacaxi", 6.30);


//        System.out.println("listar produto\n"+nome1.getNomeProd()+"\nR$ "+nome1.getValorProd());
//        System.out.println("listar produto\n"+nome2.getNomeProd()+"\nR$ "+nome2.getValorProd());
//        System.out.println("listar produto\n"+nome3.getNomeProd()+"\nR$ "+nome3.getValorProd());
//        System.out.println("listar produto\n"+nome4.getNomeProd()+"\nR$ "+nome4.getValorProd());
//        System.out.println("listar produto\n"+nome5.getNomeProd()+"\nR$ "+nome5.getValorProd());


    }

}

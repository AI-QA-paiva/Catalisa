package exercicio01;

public class Main {

    public static void main(String[] args) {

        //criando o primeiro Pais referencia para constar vizinhança ou não
        Pais nome1 = new Pais("BRA","Brasil","América do Sul",212600000,8516000);
        System.out.println();
        System.out.println("O nome do país informado foi: "+nome1.getNomePais()+"\nA sigla do país é: "+nome1.getComposicaoIso()+"\nA dimensão total é de "+nome1.getTamPais()+" km²");
        System.out.println("O tamanho da população total é de "+nome1.getTamPop()+" de habitantes");
        System.out.printf("A densidade demografica do país é de %.2f Hab/km²",nome1.calculoDeDensidadeDemografica());
        System.out.println();

        //criando os paises que terão ou não vizinhança
        Pais nome2 = new Pais("USA","Estados Unidos","América do Norte",329500000,9834000);
        Pais nome3 = new Pais("ARG","Argentina","América do Sul",45380000,2780000);
        Pais nome4 = new Pais("URU","Uruguai","América do Sul",3474000,176215);
        Pais nome5 = new Pais("COL","Colômbia","América do Sul",50880000,1142000);
        Pais nome6 = new Pais("PAR","Paraguai","América do Sul",7133000,406752);
        Pais nome7 = new Pais("CHI","Chile","América do Sul",19120000,756950);

        //execuntando o metodo de tornar o pais vizinho do outro
        Vizinhanca.compoeVizinhanca(nome1,nome3); //Brasil vizinho Argentina
        Vizinhanca.compoeVizinhanca(nome3,nome1); //inverso da linha acima (reciprocidade)
        Vizinhanca.compoeVizinhanca(nome1,nome4); //Brasil vizinho Uruguai
        Vizinhanca.compoeVizinhanca(nome4,nome1); //inverso da linha acima (reciprocidade)
        Vizinhanca.compoeVizinhanca(nome1,nome5); //Brasil vizinho Colômbia
        Vizinhanca.compoeVizinhanca(nome5,nome1); //inverso da linha acima (reciprocidade)
        Vizinhanca.compoeVizinhanca(nome1,nome6); //Brasil vizinho do Paraguai
        Vizinhanca.compoeVizinhanca(nome1,nome6); //inverso da linha acima (reciprocidade)
        Vizinhanca.compoeVizinhanca(nome3,nome4); //Argentina vizinho do Uruguai
        Vizinhanca.compoeVizinhanca(nome4,nome3); //inverso da linha acima (reciprocidade)
        Vizinhanca.compoeVizinhanca(nome3,nome6); //Argentina vizinho do Paraguai
        Vizinhanca.compoeVizinhanca(nome6,nome3); //inverso da linha acima (reciprocidade)
        Vizinhanca.compoeVizinhanca(nome3,nome7); //Argentina vizinho Chile
        Vizinhanca.compoeVizinhanca(nome7,nome3); //inverso da linha acima (reciprocidade)


        //executando o metodo que verifica se há fronteira (vizinhança) ou não com o pais referencia linha 8
        System.out.println();
        nome1.identificaVizinhos(nome2);
        nome1.identificaVizinhos(nome3);
        nome1.identificaVizinhos(nome4);
        nome1.identificaVizinhos(nome5);
        nome1.identificaVizinhos(nome6);
        nome1.identificaVizinhos(nome7);
        System.out.println();

        System.out.println();
        nome1.paisesDoContinente();


        //criando o segundo Pais referencia para constar vizinhança ou não
        System.out.println("____________________________________________________________________________");
        System.out.println("O nome do país informado foi: "+nome3.getNomePais()+"\nA sigla do país é: "+nome3.getComposicaoIso()+"\nA dimensão total é de "+nome3.getTamPais()+" km²");
        System.out.println("O tamanho da população total é de "+nome3.getTamPop()+" de habitantes");
        System.out.printf("A densidade demografica do país é de %.2f Hab/km²",nome3.calculoDeDensidadeDemografica());
        System.out.println();
        //nome2.identificaVizinhos(nome1);

        System.out.println();
        nome3.identificaVizinhos(nome1);
        nome3.identificaVizinhos(nome2);
        nome3.identificaVizinhos(nome4);
        nome3.identificaVizinhos(nome5);
        nome3.identificaVizinhos(nome6);
        nome3.identificaVizinhos(nome7);

        System.out.println();
        nome3.paisesDoContinente();


    }


}

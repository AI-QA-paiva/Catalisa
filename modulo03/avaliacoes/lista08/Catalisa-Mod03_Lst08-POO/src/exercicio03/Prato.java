package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Prato {

    private String nomePrato, ingredientes;

    Scanner digaComposicaoPrato = new Scanner(System.in);

    ArrayList <Prato> listaPratos = new ArrayList<>();


    public Prato(String nomePrato, String ingredientes) {
        this.nomePrato = nomePrato;
        this.ingredientes = ingredientes;
    }

    //public Prato(){}

    public void adicionarPrato(){
        System.out.println("Informe nome do Prato para novo cardápio: ");
        nomePrato = digaComposicaoPrato.nextLine();

        System.out.println("Informe quais ingredientes tem este prato: ");
        ingredientes = digaComposicaoPrato.nextLine();

        System.out.println("O nome do Prato cadastrado no cardápio é: "+nomePrato+",\nIngredientes: "+ingredientes);
        Prato incluiPrato = new Prato(nomePrato,ingredientes);
        listaPratos.add(incluiPrato);

    }

    public void exibirPratos(){

        System.out.println("A lista de pratos no cardápio tem o total de " + listaPratos.size() + " item(s).");
        for (int i = 0; i < listaPratos.size(); i++) {
            System.out.println("Produto (" + listaPratos.get(i).getNomePrato() + ")\nIngredientes: " + listaPratos.get(i).getIngredientes());
            System.out.println();
        }

    }

    public void excluirPrato(){
        System.out.println("Informe qual o nome do Prato que deseja excluir do cardápio: ");
        System.out.println();
        exibirPratos();

        String excluindo = digaComposicaoPrato.nextLine();

        for (int i = 0; i < listaPratos.size(); i++) {

            if (listaPratos.get(i).getNomePrato().equals(excluindo)) {
                listaPratos.remove(i);
                System.out.println("Prato removido do cardápio!");
            }

        }

    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }


}

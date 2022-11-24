package exercicio01;

import java.util.HashSet;
import java.util.Set;

public class Pais {

//criando os atributos da atividade
    private String composicaoIso,nomePais,nomeContinente;
    private int tamPop;
    private double tamPais;
    private Set<Pais> paisesDoContinente = new HashSet<>();


//criando o construtor
    public Pais(String composicaoIso, String nomePais, String nomeContinente, int tamPop, double tamPais) {
        this.composicaoIso = composicaoIso;
        this.nomePais = nomePais;
        this.nomeContinente = nomeContinente;
        this.tamPop = tamPop;
        this.tamPais = tamPais;
    }

    //criando metodos para uso na classe

    public void adicionarPaisContinente(Pais pais){
        this.paisesDoContinente.add(pais);

    }

    public void identificaVizinhos (Pais infPais){ //infoPais é a variavel, e o Pais é tipo que nesse caso é a propria classe Pais.java
        if(this.paisesDoContinente.contains(infPais)){ //contains faz uma verificação se infPais lançado, esta na Set list
            System.out.println("O país "+infPais.getNomePais()+" faz fronteira e é vizinho");

        }else {
            System.out.println("O país "+infPais.getNomePais()+" não faz fronteira e não é vizinho");
        }

    }

    public void paisesDoContinente(){
        System.out.println("Portanto, o pais informado "+getNomePais()+" tem os seguintes países como seus vizinhos:");
        for(Pais pais : paisesDoContinente) //o argumento : significa que dentro de ...
            System.out.println(pais.getNomePais());
    }

    public double calculoDeDensidadeDemografica () {
        return this.getTamPop() / this.getTamPais();

    }


///metodos get e set
    public String getComposicaoIso() {
        return composicaoIso;
    }

    public void setComposicaoIso(String composicaoIso) {
        this.composicaoIso = composicaoIso;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public int getTamPop() {
        return tamPop;
    }

    public void setTamPop(int tamPop) {
        this.tamPop = tamPop;
    }

    public double getTamPais() {
        return tamPais;
    }

    public void setTamPais(double tamPais) {
        this.tamPais = tamPais;
    }

    public Set<Pais> getPaisesDoContinente() {
        return paisesDoContinente;
    }

    public void setPaisesDoContinente(Set<Pais> paisesDoContinente) {
        this.paisesDoContinente = paisesDoContinente;
    }
}

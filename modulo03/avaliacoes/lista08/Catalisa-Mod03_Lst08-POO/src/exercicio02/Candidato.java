package exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Candidato {

    //informando os atributos; agora crie o scanner
    private String numeroMatricula;
    private float nota;

    Scanner input = new Scanner(System.in);

    //criar um ArrayList e crie o construtor

    ArrayList<Candidato> listaCandidatos = new ArrayList<>();


    //criar o construtor e em seguida criar os metodos get e set


    public Candidato(String numeroMatricula, float nota) {
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
    }

    //Criar os métodos

    public void adicionarCandidato() {

        System.out.println("Informe o número de matrícula do candidato: ");
        String matricula = input.next();

        System.out.println("Informe a nota obtida pelo candidato: ");
        float nota = input.nextFloat();

        System.out.println("Candidato cadastrado com Sucesso!\nOs dados informados são: " + matricula + ", obteve a nota " + nota);

        Candidato novoCandidato = new Candidato(matricula, nota);
        listaCandidatos.add(novoCandidato);
    }

    public void exibirCandidados() {
        System.out.println("A lista contém " + listaCandidatos.size() + " candidatos:");
        for (int i = 0; i < listaCandidatos.size(); i++) {
            System.out.println("Número de matrícula: " + listaCandidatos.get(i).getNumeroMatricula() + " com nota: " + listaCandidatos.get(i).getNota());

        }

    }

    public void excluirCandidato() {
        System.out.println("Informe qual o número da matrícula deseja Excluir:");

        exibirCandidados();

        String excluir = input.next();

        for (int i = 0; i < listaCandidatos.size(); i++) {

            if (listaCandidatos.get(i).getNumeroMatricula().equals(excluir)) {
                listaCandidatos.remove(i);
            }

        }

    }

    //criar get e set e depois volte e crie o metodos de uso atribuido
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;

    }
}
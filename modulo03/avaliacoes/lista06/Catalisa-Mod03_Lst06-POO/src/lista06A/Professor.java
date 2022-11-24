package lista06A;

import java.util.HashSet;
import java.util.Set;

public class Professor extends Funcionario {

    private Set<Turma> turmasEscolhidas = new HashSet<>();

    private String nivelGraduacao, disciplinaEnsina;
    private int quantAlunos, quantTurmas;


    public Professor(String nome, String cpf, String rg, String orgaoLotacao, String nivelGraduacao, String disciplinaEnsina, int quantAlunos, int quantTurmas, double salarioProf, Turma turma) {
        super(nome, cpf, rg, orgaoLotacao,salarioProf);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaEnsina = disciplinaEnsina;
        this.quantAlunos = quantAlunos;
        this.quantTurmas = quantTurmas;
        adicionaTurma(turma); //por ser uma composição, tem uma obrigação de começar
    }

    //criando um metodo para calcular
    public void aumentarSalario() {
        double salarioProf = getSalario() + (getSalario() * 0.10);
        setSalario(salarioProf);
    }

    //criando um metodo para adicionar turma
    public void adicionaTurma(Turma turma){
        if(turmasEscolhidas.size()<quantTurmas){
            this.turmasEscolhidas.add(turma);
        }

    }




    //criando metodos get e set
    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaEnsina() {
        return disciplinaEnsina;
    }

    public void setDisciplinaEnsina(String disciplinaEnsina) {
        this.disciplinaEnsina = disciplinaEnsina;
    }

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public int getQuantTurmas() {
        return quantTurmas;
    }

    public void setQuantTurmas(int quantTurmas) {
        this.quantTurmas = quantTurmas;
    }

    public Set<Turma> getTurmasEscolhidas() {
        return turmasEscolhidas;
    }
}

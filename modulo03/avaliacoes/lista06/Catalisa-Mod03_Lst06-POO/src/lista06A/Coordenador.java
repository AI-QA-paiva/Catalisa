package lista06A;

import java.util.HashSet;
import java.util.Set;

public class Coordenador extends Funcionario {

    //criando os atributos
    private Set<Professor> professoresSupervisionados = new HashSet<>();

    private int quantidadeProfessores;


    //criando construtor da classe Coordenador
    public Coordenador(String nome, String cpf, String rg, String orgaoLotacao, double salarioCord, int quantidadeProfessores) {
        super(nome, cpf, rg, orgaoLotacao, salarioCord); //invocaçao do construtur de funcionario
        this.quantidadeProfessores = quantidadeProfessores;
    }


    //metodo adicionar professor
    public void adicionarProfessor(Professor p) { // o metodo precisa de uma entrada, essa entraga é uma nova variavel "p",
        if (professoresSupervisionados.size() < quantidadeProfessores) {
            this.professoresSupervisionados.add(p);
        }

    }

    //criando um metodo para calcular
    public void aumentarSalario() {
        double salarioCord = this.getSalario() + (this.getSalario() * 0.05);
        setSalario(salarioCord);

    }

    //criando os modificadores get set
    public int getQuantidadeProfessores() {
        return quantidadeProfessores;
    }

    public void setQuantidadeProfessores(int quantidadeProfessores) {
        this.quantidadeProfessores = quantidadeProfessores;
    }

    public Set<Professor> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }
}

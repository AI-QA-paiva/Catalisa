package lista06A_Refactor_Srp_solid;

import java.util.HashSet;
import java.util.Set;

public class Coordenador extends Funcionario{


    private int quantidadeProfessores= 2;

    private Set<Professor> professoresSupervisionados = new HashSet<>();



    public Coordenador(String nome, String cpf, String rg, String orgaoLotacao, double salario, int quantidadeProfessores) {
        super(nome, cpf, rg, orgaoLotacao, salario);
        this.quantidadeProfessores = quantidadeProfessores;

    }


    @Override
    double getPercentualReajuste() {
        return 0.05;
    }

    void adicionarProfessor(Professor p) { // o metodo precisa de uma entrada, essa entraga é uma nova variavel "p",
        if (professoresSupervisionados.size() < quantidadeProfessores) {
            this.professoresSupervisionados.add(p);
        }

    }


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

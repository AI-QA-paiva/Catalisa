package lista06A_Refactor_Srp_solid;

import java.util.HashSet;
import java.util.Set;

public class Administrativo extends Funcionario {

    String funcaoAdm, senioridade;

    Set<Administrativo> listaAdministrativos = new HashSet<>();

    public Administrativo(String nome, String cpf, String rg, String orgaoLotacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, cpf, rg, orgaoLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }

    @Override
    double getPercentualReajuste() {
        return 0.10;
    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }


}

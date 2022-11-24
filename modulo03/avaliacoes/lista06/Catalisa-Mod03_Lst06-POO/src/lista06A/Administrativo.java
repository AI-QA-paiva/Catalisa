package lista06A;

public class Administrativo extends Funcionario {

    String funcaoAdm, senioridade;


    //criando o construtor da classe Administrativo
    public Administrativo(String nome, String cpf, String rg, String orgaoLotacao, String funcaoAdm, String senioridade, double salarioAdm) {
        super(nome, cpf, rg, orgaoLotacao,salarioAdm);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;

    }

    //criando metodo de calculo
    public void aumentarSalario() {
        double salarioAdm = getSalario() + (getSalario() * 0.10);
        setSalario(salarioAdm);
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

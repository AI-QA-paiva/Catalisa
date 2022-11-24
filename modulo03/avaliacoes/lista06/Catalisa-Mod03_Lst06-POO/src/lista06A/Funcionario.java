package lista06A;


public abstract class Funcionario {

    //criando os atributos comuns a todos (antes chamados de variaveis)

    private String nome, cpf, rg, orgaoLotacao;
    private double salario;


    //criando o construtor da classe Funcionarios

    public Funcionario(String nome, String cpf, String rg, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    public abstract void aumentarSalario();


    //criando metodos get set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

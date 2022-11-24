package lista06A_Refactor_Srp_solid;

public abstract class NaoFuncionario {

private String nome, cpf, rg, orgaoLotacao;

private double bolsaEstagio;


    public NaoFuncionario(String nome, String cpf, String rg, String orgaoLotacao, double bolsaEstagio) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoLotacao = orgaoLotacao;
        this.bolsaEstagio = bolsaEstagio;
    }

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

    public double getBolsaEstagio() {
        return bolsaEstagio;
    }

    public void setBolsaEstagio(double bolsaEstagio) {
        this.bolsaEstagio = bolsaEstagio;
    }
}

package lista06A_Refactor_Srp_solid;

public class Estagiario implements Reembolsavel {

    private String nomeEstagiario;
    private double valorBolsa;


    public Estagiario(String nomeEstagiario, double valorBolsa) {
        this.nomeEstagiario = nomeEstagiario;
        this.valorBolsa = valorBolsa;
    }


    public String getNome() {
        return nomeEstagiario;
    }

    public void setNome(String nomeEstagiario) {
        this.nomeEstagiario = nomeEstagiario;
    }


    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
}

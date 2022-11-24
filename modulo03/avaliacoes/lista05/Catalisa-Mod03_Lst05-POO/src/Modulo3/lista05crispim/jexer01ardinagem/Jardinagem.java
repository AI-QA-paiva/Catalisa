package Modulo3.lista05crispim.jexer01ardinagem;

public class Jardinagem {

    int metrosGrama;
    double valorAdubo = 3;
    double quantAdubo;
    double corteGrama = 10;

    public Jardinagem(int metrosGrama) {
        this.metrosGrama = metrosGrama;
    }

    public double usarAdubo () {

        return (metrosGrama / 2) * 0.100;

    }

    public double precoAdubo () {

        return usarAdubo()*this.valorAdubo;

    }

    public double precoCorteGrama () {
        return metrosGrama * this.corteGrama;

    }

}

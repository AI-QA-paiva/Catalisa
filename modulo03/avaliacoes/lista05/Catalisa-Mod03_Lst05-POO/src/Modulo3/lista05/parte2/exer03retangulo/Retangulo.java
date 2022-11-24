package Modulo3.lista05.parte2.exer03retangulo;

public class Retangulo {

    double ladoA;
    double ladoB;

    public Retangulo () {
        this.ladoA = ladoA;
        this.ladoB = ladoB;

    }

    public void alteraValorLados (double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;

    }


    public void mostrarLados () { //double ladoA, double ladoB
        System.out.println("valor de lado A "+ladoA);
        System.out.println("valor de lado B "+ladoB);


    }

    public double calculoArea () {
        double total =0;
        total = this.ladoA * this.ladoB;
        return total;

    }

    public double calcularPerimetro() {
        double totalP =0;
        totalP = 2 * (ladoA+ladoB);
        return totalP;

    }


}

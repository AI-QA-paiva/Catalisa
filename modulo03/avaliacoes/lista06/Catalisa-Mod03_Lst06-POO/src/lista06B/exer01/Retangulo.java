package lista06B.exer01;

public class Retangulo extends FiguraGeometrica{

    private double ladoA, ladoB;

    private double calculoAreaR;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public void calculoArea() {
        calculoAreaR = ladoA*ladoB;
    }

    public double getValorCalculado() {
        return calculoAreaR;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
}

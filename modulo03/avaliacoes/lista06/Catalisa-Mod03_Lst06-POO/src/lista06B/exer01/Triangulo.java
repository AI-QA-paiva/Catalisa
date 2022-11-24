package lista06B.exer01;

public class Triangulo extends FiguraGeometrica{

private double base, altura;

private double calculoAreaT;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calculoArea() {
        calculoAreaT= (base*altura)/2;
    }

    public double getValorCalculado() {
        return calculoAreaT;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

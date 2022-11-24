package lista06B.exer02;

public class QuadradoInter implements FiguraGeometricaInter{

    double informarLado;

    double calculandoAreaQ;


    @Override
    public void calculoDaArea() {
        calculandoAreaQ = informarLado * informarLado;
    }
}

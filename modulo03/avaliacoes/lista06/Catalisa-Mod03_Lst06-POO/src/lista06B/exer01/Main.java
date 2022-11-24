package lista06B.exer01;

public class Main {

    public static void main(String[] args) {

        FiguraGeometrica areaFiguraQ = new Quadrado(5);
        areaFiguraQ.calculoArea();
        System.out.println();
        System.out.println("O valor da área calculada para o Quadrado é "+areaFiguraQ.getValorCalculado()+" unidades de área");


        FiguraGeometrica areaFiguraR = new Retangulo(2,3);
        areaFiguraR.calculoArea();
        System.out.println();
        System.out.println("O valor da área calculada para o Retangulo é "+areaFiguraR.getValorCalculado()+" unidades de área");

        FiguraGeometrica areaFiguraT = new Triangulo(3,3);
        areaFiguraT.calculoArea();
        System.out.println();
        System.out.println("O valor da área calculada para o Triângulo é "+areaFiguraT.getValorCalculado()+" unidades de área");

        FiguraGeometrica areaFiguraC = new Circulo(1);
        areaFiguraC.calculoArea();
        System.out.println();
        System.out.println("O valor da área calculada para o Círculo é "+areaFiguraC.getValorCalculado()+" unidades de área");



    }

}

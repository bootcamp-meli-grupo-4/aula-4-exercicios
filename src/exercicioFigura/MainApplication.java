package exercicioFigura;

import java.util.Arrays;

public class MainApplication {
    public static void main(String... args) {
        FiguraGeometrica quadrado = new Retangulo(2., 2.);
        FiguraGeometrica circulo = new Circulo(3.);
        FiguraGeometrica retangulo = new Retangulo(2., 3.);
        FiguraGeometrica triangulo = new Triangulo(4., 5.);

        System.out.println(
                FiguraGeometricaUtils.calculaAreaMedia(
                        Arrays.asList(quadrado, retangulo, circulo, triangulo)
                                .toArray(FiguraGeometrica[]::new)
                )
        );
    }
}

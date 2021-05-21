package exercicioFigura;

import java.util.Arrays;

public class FiguraGeometricaUtils {
    public static Double calculaAreaMedia(FiguraGeometrica[] figuraGeometricas) {
        Double somaAreas = Arrays
                .stream(figuraGeometricas)
                .map(FiguraGeometrica::area)
                .reduce(.0, Double::sum);

        return somaAreas/figuraGeometricas.length;
    }
}

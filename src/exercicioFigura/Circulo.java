package exercicioFigura;

public class Circulo extends FiguraGeometrica {

    private static final Double PI = Math.PI;

    private final Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI * Math.pow(raio, 2);
    }
}

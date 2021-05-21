package exercicioFigura;

public class Triangulo extends FiguraGeometrica {

    private final Double base;

    private final Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }
}

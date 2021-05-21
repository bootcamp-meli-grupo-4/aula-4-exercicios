package exercicioFigura;

public class Retangulo extends FiguraGeometrica {

    private final Double largura;

    private final Double altura;

    public Retangulo(Double largura, Double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }
}

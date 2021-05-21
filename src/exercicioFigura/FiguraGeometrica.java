package exercicioFigura;

public abstract class FiguraGeometrica {

    public abstract double area();

    @Override
    public String toString() {
        return String.format("Area da figura %s e %.2f", this.getClass().getSimpleName(), area());
    }
}

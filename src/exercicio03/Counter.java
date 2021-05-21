package exercicio03;

public class Counter {
    private int valor;

    public Counter(){
    }

    public Counter(int valor) {
        this.valor = valor;
    }

    public void aumenta(int valor){
        this.valor += valor;
    }

    public void diminui(int valor){
        this.valor -= valor;
    }

    public Counter (Counter counter){
        this.setValor(counter.getValor());
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}

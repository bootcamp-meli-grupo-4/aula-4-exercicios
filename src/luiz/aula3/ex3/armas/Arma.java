package luiz.aula3.ex3.armas;

public abstract class Arma {

    protected Integer danoMaximo;

    protected Integer danoMinimo;

    public Integer gerarDano() {
        return (int) Math.floor(Math.random()*(danoMaximo - danoMinimo +1 ) + danoMinimo);
    }
}

package dakar;

public class Carro extends Veiculo{
    public Carro(Double velocidade, Double aceleracao, Double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa);
        this.setPeso(1000d);
        this.setRodas(4);
    }
}

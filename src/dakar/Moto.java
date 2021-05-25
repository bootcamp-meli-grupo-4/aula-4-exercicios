public class Moto extends Veiculo{
    public Moto(Double velocidade, Double aceleracao, Double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa);
        this.setPeso(300d);
        this.setRodas(2);
    }
}

import java.util.Random;

public abstract class Veiculo {
    private Double velocidadeMaxima;
    private Double velocidadeAtual;
    private Double aceleracao;
    private Double anguloGiro;
    private String placa;
    private Double peso;
    private Integer rodas;
    private Double distanciaPecorrida;
    private Boolean estaQuebrado;

    public Veiculo(Double velocidadeMaxima, Double aceleracao, Double anguloGiro, String placa) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.aceleracao = aceleracao;
        this.anguloGiro = anguloGiro;
        this.placa = placa;
        this.velocidadeAtual = 0.;
        this.distanciaPecorrida = 0.;
        estaQuebrado = false;
    }

    public void consertarVeiculo() {
        estaQuebrado = false;
    }

    public void correr() {
        quebrarVeicuilo();

        if(estaQuebrado) {
            velocidadeAtual = .0;
            return;
        }

        Double novaVelocidade = this.velocidadeAtual + aceleracao;

        if(novaVelocidade <= velocidadeMaxima) this.velocidadeAtual = novaVelocidade;

        distanciaPecorrida += this.velocidadeAtual;
    }

    private void quebrarVeicuilo() {
        int valorAleatorio = new Random().nextInt(100);
        if(valorAleatorio <= 50) estaQuebrado = true;
        else estaQuebrado = false;
    }

    public Boolean getEstaQuebrado() {
        return estaQuebrado;
    }

    public Double getDistanciaPecorrida() {
        return distanciaPecorrida;
    }

    public Double potencia(){
        return velocidadeMaxima *  aceleracao / ( anguloGiro * (peso - rodas * 100));
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(Double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public Double getAnguloGiro() {
        return anguloGiro;
    }

    public void setAnguloGiro(Double anguloGiro) {
        this.anguloGiro = anguloGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getRodas() {
        return rodas;
    }

    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidadeMaxima=" + velocidadeMaxima +
                ", aceleracao=" + aceleracao +
                ", anguloGiro=" + anguloGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }
}

package dakar;

import java.util.*;

public class Corrida {
    private Double distancia;
    private Double premioDolar;
    private String nome;
    private Integer quantidadeVeiculos;
    private List<Veiculo> veiculoList = new ArrayList<>();
    private Map<Class, Socorrista> socorristas = new HashMap<>();

    public Corrida(Double distancia, Double premioDolar, String nome, Integer quantidadeVeiculos) {
        this.distancia = distancia;
        this.premioDolar = premioDolar;
        this.nome = nome;
        this.quantidadeVeiculos = quantidadeVeiculos;
        this.socorristas.put(Carro.class, new Socorrista<Carro>());
        this.socorristas.put(Moto.class, new Socorrista<Moto>());
    }

    public void registrarCarro(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa){
        Veiculo veiculo = new Carro(velocidade, aceleracao, anguloDeGiro, placa);
        registraVeiculo(veiculo);
    }

    public void registrarMoto(Double velocidade,Double aceleracao,Double anguloDeGiro, String placa){
        Veiculo veiculo = new Moto(velocidade, aceleracao, anguloDeGiro, placa);
        registraVeiculo(veiculo);
    }

    private void registraVeiculo(Veiculo veiculo) {
        if (veiculoList.size() < quantidadeVeiculos)
            veiculoList.add(veiculo);
        else
            System.out.println("Nao e possivel inserir veiculo");
    }

    public void removerVeiculo(Veiculo veiculo){
        veiculoList.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa){
        encontraVeiculo(placa)
                .ifPresent(this::removerVeiculo);
    }

    private Optional<Veiculo> encontraVeiculo(String placa) {
        return veiculoList.stream()
                .filter(veiculo -> veiculo.getPlaca().equals(placa))
                .findFirst();
    }

    public boolean correr() {
        socorrerVeiculosQuebrados();
        veiculoList.forEach(Veiculo::correr);
        return existeCampeao();
    }

    public Optional<Veiculo> getCampeao() {
        return veiculoList.stream().filter(v -> v.getDistanciaPecorrida() >= this.distancia).findFirst();
    }

    public boolean existeCampeao() {
        return veiculoList.stream().anyMatch(v -> v.getDistanciaPecorrida() >= this.distancia);
    }

    private void socorrerVeiculosQuebrados() {
        veiculoList.stream().filter(Veiculo::getEstaQuebrado).forEach(v -> socorrer(v.getPlaca()));
    }

    public Veiculo vencedor(){
        return veiculoList.stream().max(Comparator.comparing(Veiculo::potencia)).get();
    }

    public void socorrer(String placa){
        encontraVeiculo(placa).ifPresent(veiculo -> this.socorristas.get(veiculo.getClass()).socorrer(veiculo));
    }

    public List<Veiculo> getVeiculoList() {
        return veiculoList;
    }
}

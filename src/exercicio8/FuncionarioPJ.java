package aula21Maio2;

public class FuncionarioPJ extends Funcionario implements PagarSalario{
    private Integer horaTrabalhadas = 0;
    private Double valorHora;

    public  FuncionarioPJ(String nome, Integer idade, String genero, Double valorHora){
        super(nome, idade, genero);
        this.valorHora = valorHora;
    }

    public Integer getHoraTrabalhadas() {
        return horaTrabalhadas;
    }

    public void setHoraTrabalhadas(Integer horaTrabalhadas) {
        this.horaTrabalhadas += horaTrabalhadas;
    }

    @Override
    public Double pagamentoSalario() {
        return horaTrabalhadas * valorHora;
    }
}

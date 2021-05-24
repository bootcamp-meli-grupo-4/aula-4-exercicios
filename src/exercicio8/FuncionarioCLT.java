package aula21Maio2;

public class FuncionarioCLT extends Funcionario implements PagarSalario{
    private Double salarioBase;
    private Double percentagemBonus;

    public FuncionarioCLT(String nome, Integer idade, String genero){
        super(nome, idade, genero);
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setPercentagemBonus(Double percentagemBonus) {
        this.percentagemBonus = percentagemBonus;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public Double getPercentagemBonus() {
        return percentagemBonus;
    }

    @Override
    public Double pagamentoSalario() {
        return getSalarioBase() + (getSalarioBase() * getPercentagemBonus());
    }
}

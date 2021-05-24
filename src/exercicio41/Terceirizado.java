package exercicio41;

public class Terceirizado extends PJ{
    private Integer horas;
    private Double valorHora;

    public Terceirizado(Integer horas, Double valorHora) {
        this.horas = horas;
        this.valorHora =valorHora;
    }

    @Override
    public Double pagaSalario() {
        return horas*valorHora;
    }
}

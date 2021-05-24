package exercicio41;

public class Diretor extends CLT{
    Double lucrosEmpresa;

    public Diretor(Double bonus, Integer horas, Integer descancoRemunerado, Double salarioBase, Double lucrosEmpresa) {
        super(bonus, horas, descancoRemunerado, salarioBase);
        this.lucrosEmpresa = lucrosEmpresa;
    }

    @Override
    public Double pagaSalario() {
        return salarioBase + ((this.bonus/100)*this.lucrosEmpresa);
    }
}

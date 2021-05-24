package exercicio41;

public abstract class CLT implements Categoria{
    Double bonus;
    Integer horas;
    Integer descancoRemunerado;
    Double salarioBase;

    public CLT(Double bonus, Integer horas, Integer descancoRemunerado, Double salarioBase) {
        this.bonus = bonus;
        this.horas = horas;
        this.descancoRemunerado = descancoRemunerado;
        this.salarioBase = salarioBase;
    }

    public Double pagaSalario() {
        double bonusPorcentagem = this.bonus / 100;
        Double bonusTotal = bonusPorcentagem*this.salarioBase;
        return bonusTotal+salarioBase;
    }
}

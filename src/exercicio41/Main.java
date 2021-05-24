package exercicio41;

public class Main {
    public static void main(String[] args) {
        Funcionario diretor = new Funcionario("Stello", new Diretor(3d, 40, 0, 15000d, 1000000d));
        Funcionario gerente = new Funcionario("Stello", new Gerente(12.5d, 40, 0, 6000d));
        Funcionario analista = new Funcionario("Stello", new Analista(8d, 40, 0, 4000d));
        Funcionario tecnico = new Funcionario("Stello", new Tecnico(5d, 40, 0, 3200d));
        Funcionario terceirizado = new Funcionario("Stello", new Terceirizado(100, 20d));

        System.out.println(diretor.pagarSalario());
        System.out.println(gerente.pagarSalario());
        System.out.println(analista.pagarSalario());
        System.out.println(tecnico.pagarSalario());
        System.out.println(terceirizado.pagarSalario());
    }
}
package aula21Maio2;

public class Main {
    public static void main(String[] args) {
        FuncionarioPJ teste = new FuncionarioPJ("felipe",30,"masculino",110.00);

        teste.setHoraTrabalhadas(10);
        System.out.println(teste.pagamentoSalario());

        FuncionarioCLT_Analista teste2 = new FuncionarioCLT_Analista("Felipe",30,"MAsc");

        System.out.println(teste2.pagamentoSalario());
    }
}

package aula21Maio2;

public class FuncionarioCLT_Gerente extends FuncionarioCLT{
    public FuncionarioCLT_Gerente(String nome, Integer idade, String genero){
        super(nome, idade, genero);
        setSalarioBase(2000.0);
        setPercentagemBonus(0.125);
    }

}

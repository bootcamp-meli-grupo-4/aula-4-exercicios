package aula21Maio2;

public class FuncionarioCLT_Tecnico extends FuncionarioCLT{
    public FuncionarioCLT_Tecnico(String nome, Integer idade, String genero){
        super(nome, idade, genero);
        setSalarioBase(3200.0);
        setPercentagemBonus(0.05);
    }

}

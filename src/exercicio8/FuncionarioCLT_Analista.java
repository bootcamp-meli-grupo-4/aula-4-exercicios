package aula21Maio2;

public class FuncionarioCLT_Analista extends FuncionarioCLT{
    public FuncionarioCLT_Analista(String nome, Integer idade, String genero){
        super(nome, idade, genero);
        setSalarioBase(40000.0);
        setPercentagemBonus(0.08);
    }
}

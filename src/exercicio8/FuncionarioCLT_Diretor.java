package aula21Maio2;

public class FuncionarioCLT_Diretor extends FuncionarioCLT{
    public FuncionarioCLT_Diretor(String nome, Integer idade, String genero){
        super(nome, idade, genero);
        setSalarioBase(15000.0);
        setPercentagemBonus(0.03);
    }

}

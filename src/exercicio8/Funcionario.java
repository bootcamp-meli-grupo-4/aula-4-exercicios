package aula21Maio2;

public class Funcionario {
    private String nome;
    private Integer idade;
    private String genero;

    public  Funcionario(String nome, Integer idade, String dataNascimento){
        this.nome = nome;
        this.idade = idade;
        this.genero = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setDataNascimento(String dataNascimento) {
        this.genero = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getDataNascimento() {
        return genero;
    }
}

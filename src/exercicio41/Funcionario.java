package exercicio41;

public class Funcionario {
    private String nome;
    private Categoria categoria;

    public Funcionario(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public Double pagarSalario(){
        return categoria.pagaSalario();
    }
}

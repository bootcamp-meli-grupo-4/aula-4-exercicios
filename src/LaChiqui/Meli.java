package LaChiqui;

public class Meli extends Convidados{
    public Meli(String nome) {
        this.nome = nome;
    }

    @Override
    public void comer() {
        System.out.println(this.nome + ": Viva la Chiqui !!");
    }
}

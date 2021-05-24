package exercicioRegex;

public class Main {
    public static void main(String[] args) {
        Senha senhaFraca = new Senha("teste");
        Senha senhaMedia = new Senha("TESTESENHA");
        Senha senhaForte = new Senha("12123322333232");
        Senha erroSenha = new Senha(".,.,.'");
    }
}

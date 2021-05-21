package exercicioRegex;

public class ErrorPassword implements Password {
    @Override
    public void validaSenha(String password) {
        throw new IllegalArgumentException("Valor da senha "+password+" invalido");
    }

    @Override
    public void proximo(Password password) {
        //nothing
    }
}

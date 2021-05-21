package exercicioRegex;

public class Senha {
    private String valor;

    public Senha(String valor) {
        this.setValor(valor);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        Password passwordStrong = new PasswordStrong();
        Password passwordMedia = new PasswordMedia();
        Password passwordWeak = new PasswordWeak();
        Password errorPassword = new ErrorPassword();

        passwordWeak.proximo(passwordMedia);
        passwordMedia.proximo(passwordStrong);
        passwordStrong.proximo(errorPassword);

        passwordWeak.validaSenha(valor);

        this.valor = valor;
    }
}

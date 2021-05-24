package exercicioRegex;

public class PasswordStrong implements Password {
    private static final String REGEX = "[0-9]" ;
    private Password nextPassword;

    @Override
    public void validaSenha(String password) {

        if(this.validaRegex(REGEX, password)) {
            System.out.println("Senha FORTE");
            return;
        }

        if (this.nextPassword != null){
            this.nextPassword.validaSenha(password);
        } else {
            System.out.println("Senha NÃO É FORTE !");
        }
    }

    @Override
    public void proximo(Password password) {
        this.nextPassword = password;
    }
}

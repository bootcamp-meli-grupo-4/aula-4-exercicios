package exercicioRegex;

public class PasswordWeak implements Password {
    private static final String REGEX = "[a-z]" ;
    private Password nextPassword;

    @Override
    public void validaSenha(String password) {

        if(this.validaRegex(REGEX, password)) {
            System.out.println("Senha FRACA");
            return;
        }

        if (this.nextPassword != null){
            this.nextPassword.validaSenha(password);
        } else {
            System.out.println("Senha NÃO É FRACA !");
        }
    }

    @Override
    public void proximo(Password password) {
        this.nextPassword = password;
    }
}

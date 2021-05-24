package exercicioRegex;

public class PasswordMedia implements Password {
    private static final String REGEX = "[A-Z]" ;
    private Password nextPassword;

    @Override
    public void validaSenha(String password) {

        if(this.validaRegex(REGEX, password)) {
            System.out.println("Senha MEDIA");
            return;
        }

        if (this.nextPassword != null){
            this.nextPassword.validaSenha(password);
        } else {
            System.out.println("Senha NÃO É MEDIA !");
        }
    }

    @Override
    public void proximo(Password password) {
        this.nextPassword = password;
    }
}

package exercicioRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Password {
    public void validaSenha(String senha);

    public void proximo(Password password);

    default boolean validaRegex(String regex, String senha){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(senha);
        return  matcher.find();

    }
}

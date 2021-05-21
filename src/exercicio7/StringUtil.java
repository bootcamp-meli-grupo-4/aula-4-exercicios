package exercicio7;

public class StringUtil {
    public static String lpad(String msg, char caracter, int quantidadeDeVezes) {
        if(quantidadeDeVezes == 0) return msg;
        StringBuilder msgBuilder = new StringBuilder(msg);
        for(int i = 0; i < quantidadeDeVezes; i++) {
            msgBuilder.insert(0, caracter);
        }
        return msgBuilder.toString();
    }

    public static String rpad(String msg, char caracter, int quantidadeDeVezes) {
        if(quantidadeDeVezes == 0) return msg;
        StringBuilder msgBuilder = new StringBuilder(msg);
        for(int i = 0; i < quantidadeDeVezes; i++) {
            msgBuilder.append(caracter);
        }
        return msgBuilder.toString();
    }

    public static String ltrim(String msg) {
        int pos = 0;
        for(char a: msg.toCharArray()) {
            if(Character.isWhitespace(a))
                pos++;
            else
                break;
        }
        return msg.substring(pos, msg.length());
    }

    public static String rtrim(String msg) {
        String mensagemInvertida = new StringBuilder(msg).reverse().toString();
        String novaMensagem = ltrim(mensagemInvertida);
        return new StringBuilder(novaMensagem).reverse().toString();
    }

    public static String trim(String msg) {
        msg = ltrim(msg);
        return rtrim(msg);
    }

    public static int indexOfN(String msg, char caracter, int n) {
        int pos = 0;
        int contadorQuantidadeCaracter = 0;

        for(char a: msg.toCharArray()) {
            if(caracter == a)
                contadorQuantidadeCaracter++;
            if(contadorQuantidadeCaracter == n)
                break;
            pos++;
        }

        if(contadorQuantidadeCaracter == n) return pos;

        return -1;
    }
}

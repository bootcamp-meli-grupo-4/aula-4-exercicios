package luiz.aula4.savetheropa;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        Vestuario casaco = new Vestuario("blabla", "casaco");
        Vestuario roupao = new Vestuario("booboo", "roupao");

        GuardaRoupa guardaRoupa = new GuardaRoupa();

        guardaRoupa.guardarVestuarios(List.of(casaco, roupao));

        Vestuario mochile = new Vestuario("foo", "mochile");
        guardaRoupa.guardarVestuarios(List.of(mochile));

        guardaRoupa.imprimirVestuarios();

        guardaRoupa.retirarVestuarios(0);
    }
}

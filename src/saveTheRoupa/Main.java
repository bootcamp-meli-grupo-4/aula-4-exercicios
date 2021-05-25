package saveTheRoupa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vestuario v1 = new Vestuario("C&A", "Camisa");
        Vestuario v2 = new Vestuario("C&A", "Polo");
        GuardaRoupa guardaRoupa = new GuardaRoupa();

        Integer id = guardaRoupa.guardarVestuarios(Arrays.asList(v1, v2));
        System.out.println(id);

        guardaRoupa.mostrarVestuarios();
        guardaRoupa.devolverVestuarios(id);
        System.out.println("============");
        guardaRoupa.mostrarVestuarios();

    }
}

package LaChiqui;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento();
        Convidados c1 = new Standard("Mano Brown");
        Convidados c2 = new Meli("Edi Rock");
        Convidados c3 = new Meli("Kl Jay");
        Convidados c4 = new Standard("Ice Blue");

        evento.adcionarConvidados(c1, c2, c3, c4);
        evento.adicionarFogos(new FogoIndividual());
        evento.adicionarFogos(new FogoPacote(
                Arrays.asList(
                        new FogoIndividual(),
                        new FogoIndividual(),
                        new FogoIndividual()
                ))
        );



        evento.apagaVela();
    }
}

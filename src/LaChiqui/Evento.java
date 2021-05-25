package LaChiqui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Evento {
    private List<Artificios> fogos = new ArrayList<>();
    private List<Convidados> convidados = new ArrayList<Convidados>();


    public void apagaVela(){
        explodirFogos();
        distribuirBolo();
    }

    public void adicionarFogos(Artificios artificios){
        fogos.add(artificios);

    }

    public void adcionarConvidados(Convidados ...convidado){
        convidados.addAll(Arrays.asList(convidado));
    }

    private void explodirFogos(){
        fogos.forEach(Artificios::explode);
    }

    private void distribuirBolo(){
        convidados.forEach(Convidados::comer);
    }
}

package LaChiqui;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FogoPacote implements Artificios{
    private List<Artificios> fogos = new ArrayList<>();

    public FogoPacote(List<Artificios> fogos) {
        this.fogos = fogos;
    }

    public void adicionarFogosPct(Artificios artificios){
        fogos.add(artificios);

    }

    private void explodirFogos(){
        fogos.forEach(Artificios::explode);
    }

    @Override
    public void explode() {
        explodirFogos();
    }
}

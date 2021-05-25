package luiz.aula3.ex3;

import luiz.aula3.ex3.armas.Arco;
import luiz.aula3.ex3.armas.Arma;
import luiz.aula3.ex3.armas.Cajado;
import luiz.aula3.ex3.armas.Espada;
import luiz.aula3.ex3.classes.Classe;
import luiz.aula3.ex3.classes.Guerreiro;
import luiz.aula3.ex3.classes.Mago;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class MainApplication {
    public static void main(String[] args) {
        Arma cajado = new Cajado();
        Classe mago = new Mago();

        Personagem luiz = new Personagem("luiz", 1, mago, 100, cajado);

        Arma espada = new Espada();
        Classe guerreiro = new Guerreiro();
        Personagem ferreira = new Personagem("ferreira", 1, guerreiro, 100, espada);

        luiz.atacar(ferreira);
        ferreira.atacar(luiz);

        int contador = 0;
        while (luiz.getVida() != 0 || ferreira.getVida() != 0) {
            luiz.atacar(ferreira);
            if(ferreira.getVida() == 0) break;

            ferreira.atacar(luiz);
            if(luiz.getVida() == 0) break;

            // Trocando de Arma
            if(contador % 2 == 0) {
                luiz.empunharArma(espada);
                ferreira.empunharArma(cajado);
            }

            contador++;
        }

        System.out.printf("\n\n\nOrdenando armas em ordem alfabetica:\n");
        ordenarArmaPorOrdemAlfabetica();
    }

    public static void imprimirPersonagem(Personagem... personagem) {
        Arrays.stream(personagem).forEach(System.out::println);
    }

    public static void ordenarArmaPorOrdemAlfabetica() {
        Arma[] armas = {new Espada(), new Cajado(), new Arco()};

        Collection<String> sortedWeapons = new TreeSet<>();
        Arrays.stream(armas).forEach(arma -> {
            sortedWeapons.add(arma.getClass().getName().split("\\.")[4]);
        });

        sortedWeapons.stream().forEach(System.out::println);
    }
}

package luiz.aula3.ex3;

import luiz.aula3.ex3.armas.Arma;
import luiz.aula3.ex3.classes.Classe;

public class Personagem {
    private String nome;

    private Integer nivel;

    private Classe classe;

    private Integer vida;

    private Arma arma;

    public Personagem(String nome, Integer nivel, Classe classe, Integer vida, Arma arma) {
        this.nome = nome;
        this.nivel = nivel;
        this.classe = classe;
        this.vida = vida;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Arma getArma() {
        return arma;
    }

    public void empunharArma(Arma arma) {
        this.arma = arma;
    }

    public Integer getVida() {
        return vida;
    }

    public void atacar(Personagem personagem) {
        Integer danoCausado = this.arma.gerarDano();
        System.out.printf("Personagem %s ataca %s causando %d de dano. O personagem %s mitigou ",
                this.nome, personagem.nome, danoCausado, personagem.nome);
        personagem.defender(danoCausado);
        System.out.printf(" Personagem %s possui %d de vida.\n", personagem.nome, personagem.vida);
    }

    private void defender(Integer dano) {
        Integer danoMitigado = classe.getBonusDefesa();
        Integer danoSofrido = dano - danoMitigado;
        vida -= (danoSofrido);
        System.out.printf("%d do dano da arma sofrendo %d de dano.", danoMitigado, danoSofrido);
        if(vida < 0) vida = 0;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", classe=" + classe +
                ", vida=" + vida +
                ", arma=" + arma +
                '}';
    }
}

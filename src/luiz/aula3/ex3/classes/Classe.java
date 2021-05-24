package luiz.aula3.ex3.classes;

public abstract class Classe {
    protected Integer defesa;

    public Integer getBonusDefesa() {
        return gerarDefesa();
    }

    private Integer gerarDefesa() {
        return (int) Math.floor(Math.random()*(defesa +1 ));
    }
}

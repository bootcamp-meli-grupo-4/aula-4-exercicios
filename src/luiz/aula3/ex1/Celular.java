package luiz.aula3.ex1;

public class Celular implements Precedente<Celular> {

    private String number;

    private String holder;

    public Celular(String holder, String number) {
        this.number = number;
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public int precedeA(Celular a) {
        return this.getNumber().length() - a.getNumber().length();
    }

    @Override
    public String toString() {
        return "Celular{" +
                "number='" + number + '\'' +
                ", holder='" + holder + '\'' +
                '}';
    }
}

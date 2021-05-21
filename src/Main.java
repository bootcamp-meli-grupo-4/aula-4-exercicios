import exercicio03.Counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(4);
        Counter counter1 = new Counter(10);

        counter.aumenta(10);
        Counter counter2 = new Counter(counter1);

        System.out.println(counter.getValor());
        System.out.println(counter1.getValor());
        System.out.println(counter2.getValor());
    }
}

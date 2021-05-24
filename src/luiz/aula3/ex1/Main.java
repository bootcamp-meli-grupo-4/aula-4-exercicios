package luiz.aula3.ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Precedente[] arr = new Precedente[3];
        arr[0] = new Pessoa("ada", "3213211444");
        arr[1] = new Pessoa("ada", "32132112");
        arr[2] = new Pessoa("ada", "321321133");
        SortUtil.sort(arr);

        Arrays.stream(arr).forEach(System.out::println);

        Precedente[] celulares = new Precedente[3];
        celulares[0] = new Celular("luiz", "12345");
        celulares[1] = new Celular("ferreira", "123");
        celulares[2] = new Celular("junior", "1");
        SortUtil.sort(celulares);

        Arrays.stream(celulares).forEach(System.out::println);
    }
}

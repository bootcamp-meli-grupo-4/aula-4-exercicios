package luiz.aula3.ex2;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        MyFactory.createInstance();
        testeArrayStringQuickSort();
        testeArrayInteirosQuickSort();
    }

    static void testeArrayInteirosQuickSort() {
        Sorter quickSort = (Sorter) MyFactory.getInstance("sorter");
        Integer[] arrayInteger = {1000, 500, 250, 125, 60, 30, 15, 7, 1};

        quickSort.sort(arrayInteger, (o1, o2) -> {
            if(o1 instanceof Integer && o2 instanceof Integer) {
                return (Integer)o1 - (Integer)o2;
            }
            return 0;
        });
        Arrays.stream(arrayInteger).forEach(System.out::println);
    }

    static void testeArrayStringQuickSort() {
        Sorter quickSort = (Sorter) MyFactory.getInstance("sorter");
        String[] arrayString = {"abcde", "abcd", "abc", "ab", "a"};

        quickSort.sort(arrayString, (o1, o2) -> {
            if(o1 instanceof String && o2 instanceof String) {
                String one = (String)o1;
                String two = (String)o2;
                return one.length() - two.length();
            }
            return 0;
        });
        Arrays.stream(arrayString).forEach(System.out::println);
    }
}

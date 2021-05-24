package luiz.aula3.ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainApplication {
    public static void main(String[] args) {
        MyFactory.createInstance();
        testeArrayStringQuickSort();
        testeArrayInteirosQuickSort();
        testeTempoSorters();
    }

    static void testeTempoSorters() {
        Time time = new Time();
        Integer[] intersToSort = IntStream.iterate(5000, n -> n - 1).limit(5000).boxed().toArray(Integer[]::new);
        String[] sorters = {"quick", "heap", "bubble"};
        Arrays.stream(sorters).forEach(sorter -> {
            time.reset();
            Sorter sorterAlg = (Sorter) MyFactory.getInstance(sorter);
            System.out.printf("\n\nIniciando Algoritimo de ordenacao %s \n", sorter);
            Integer[] toSort = intersToSort.clone();
            Comparator<Integer> comparator = (o1, o2) -> {
                if(o1 != null && o2 != null) {
                    return (Integer)o1 - (Integer)o2;
                }
                return 0;
            };

            time.start();
            sorterAlg.sort(toSort, comparator);
            time.end();
            System.out.printf("Levou %d ms para organizar o array\n", time.elapsedTime()/1000000);
        });


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
        //Arrays.stream(arrayInteger).forEach(System.out::println);
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
        //Arrays.stream(arrayString).forEach(System.out::println);
    }
}

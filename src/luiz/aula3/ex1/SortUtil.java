package luiz.aula3.ex1;

public class SortUtil<T> {
    public static <T extends Precedente> void sort(T... arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i -1; j++) {
                if(arr[j].precedeA(arr[j+1]) > 0) {
                    swap(j, j+1, arr);
                }
            }
        }

    }

    private static <T extends Precedente> void swap(int indexOne, int indexTwo, T... arr) {
        T temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}

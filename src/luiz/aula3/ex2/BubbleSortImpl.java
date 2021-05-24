package luiz.aula3.ex2;

import java.util.Comparator;

public class BubbleSortImpl<T> implements Sorter<T> {
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i -1; j++) {
                if(c.compare(arr[j], arr[j+1]) > 0) {
                    swap(j, j+1, arr);
                }
            }
        }
    }

    private void swap(int indexOne, int indexTwo, T[] arr) {
        T temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}

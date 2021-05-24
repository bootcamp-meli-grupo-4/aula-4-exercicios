package luiz.aula3.ex2;

import java.util.Comparator;

// https://gist.github.com/jayeshsolanki93/10404303
public class QuickSortImple<T> implements Sorter<T> {
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        sort(arr, 0, arr.length - 1, c);
    }

    private void sort(T[] arr, int start, int end, Comparator<T> c) {
        if (start < end) {
            int pIndex = partition(arr, start, end, c);
            sort(arr, start, pIndex - 1, c);
            sort(arr, pIndex + 1, end, c);
        }
    }

    private int partition(T[] arr, int start, int end, Comparator<T> c) {
        T pivot = arr[end];
        int pIndex = start;
        for (int i = start; i < end; i++) {
            if (c.compare(arr[i], pivot) <= 0) {
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        swap(arr, pIndex, end);
        return pIndex;
    }

    private void swap(T arr[], int x, int y) {
        T temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

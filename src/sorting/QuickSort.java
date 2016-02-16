package sorting;

/**
 * Created by Hongze Wu on 2015/9/15.
 */
public class QuickSort<T extends Sortable> {
    private int size;
    private T[] buffer;

    public QuickSort(T[] buffer) {
        this.size = buffer.length;
        this.buffer = buffer;
    }

    public void recursiveQuickSort(int p, int r) {
        if(p < r) {
            int q = partition(p, r);
            recursiveQuickSort(p, q-1);
            recursiveQuickSort(q+1, r);
        }
    }

    private int partition(int p, int r) {
        T pivot = buffer[r];
        int i = p - 1;

        for(int j = p; j <= (r-1); j++) {
            //if(buffer[j] <= pivot) {
            if(buffer[j].compareTo(pivot) <= 0) {
                i++;

                // swap
                T tmp = buffer[i];
                buffer[i] = buffer[j];
                buffer[j] = tmp;
            }
        }

        // swap i+1 with pivot
        T tmp = buffer[i+1];
        buffer[i+1] = buffer[r];
        buffer[r] = tmp;

        return i+1;
    }
}

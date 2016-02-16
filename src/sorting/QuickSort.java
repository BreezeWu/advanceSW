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

    public void sort(int p, int r) {
        if(p < r) {
            int q = partition(p, r);
            sort(p, q-1);
            sort(q+1, r);
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
                swap(i,j);
            }
        }

        // swap i+1 with pivot
        swap(i+1, r);

        return i+1;
    }
    
    private void swap(int i, int j) {
        T tmp = buffer[i];
        buffer[i] = buffer[j];
        buffer[j] = tmp;
    }
}

package basic.object;

/**
 * Created by Hongze Wu on 2015/9/15.
 */
public class Queue<T> {
    private T[] buffer;

    private int size;
    private int head;
    private int tail;
    private int counter;

    public Queue(int size) {
        buffer = (T[])new Object[size];

        this.size = size;
        head = 0;
        tail = 0;

        counter = 0;
    }

    public void enQueue(T x) throws Exception {
        if(counter == size) {
            throw new Exception("Queue is full!");
        }

        buffer[tail] = x;
        counter++;

        if(tail == (size-1)) {
            tail = 1;
        } else {
            tail += 1;
        }
    }

    public T deQueue() {
        if(counter == 0) {
            //throw new Exception("Queue is empty!");
            return null;
        }

        T x = buffer[head];
        counter--;

        if(head == (size-1)) {
            head = 0;
        } else {
            head += 1;
        }

        return x;
    }
}

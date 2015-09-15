package basic.object;

/**
 * Created by Administrator on 2015/9/15.
 */
public class Stack<T> {
    private int size;
    T[] buffer;
    private int top;

    public Stack(int size) {
        buffer = (T[])new Object[size];

        this.size = size;
        top = 0;
    }

    public boolean isEmpty() {
        if(0 == top) {
            return true;
        } else {
            return false;
        }
    }

    public void push(T x) throws Exception {
        if(top == (size -1)) {
            throw new Exception("Stack is full!");
        }

        buffer[top] = x;
        top ++;
    }

    public T pop() {
        if(isEmpty()) {
            return null;
        } else {
            T x = buffer[top];
            top --;

            return x;
        }
    }
}

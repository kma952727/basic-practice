package structure.myQueue;

import java.util.NoSuchElementException;

public class MyQueue {

    public int[] arr;
    public int size;

    public MyQueue(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void add(int data) {
        if(size == arr.length) {
            int newLength = size + 50;
            int[] copiedArr = new int[newLength];
            System.arraycopy(arr, 0, copiedArr, 0, size);
            arr = copiedArr;
        }
        arr[size++] = data;
    }
    public void remove() {
        if(size == 0) throw new NoSuchElementException("queue is empty");
        arr[size-1] = 0;
    }
    public int element() {
        if(size == 0) throw new NoSuchElementException("queue is empty");
        return arr[0];
    }
}

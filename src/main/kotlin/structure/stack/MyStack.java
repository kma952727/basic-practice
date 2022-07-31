package structure.stack;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class MyStack {

    private int[] intArray;
    private int size;
    public MyStack() {
        intArray = new int[10];
        size = 0;
    }
    synchronized void push(int data)
    {
        intArray[size++] = data;
    }
    synchronized void pop()
    {
        if(size <= 0) throw new RuntimeException("no!");
        int[] newIntArr = new int[size-1];
        System.arraycopy(intArray, 0, newIntArr, 0, size-1);
        intArray = newIntArr;
        size--;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "intArray=" + Arrays.toString(intArray) +
                ", size=" + size +
                '}';
    }
}

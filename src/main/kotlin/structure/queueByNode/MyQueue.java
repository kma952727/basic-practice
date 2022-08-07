package structure.queueByNode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MyQueue {
    private int[] intArr;

    public MyQueue() {}
    public MyQueue(int[] intArr) {
        this.intArr = intArr;
    }
    public void enQueue(int data)
    {
        if(intArr == null) {
            intArr = new int[1];
            intArr[0] = data;
            return;
        }
        intArr = Arrays.copyOf(intArr, intArr.length + 1);
        intArr[intArr.length-1] = data;
    }

    public void deQueue()
    {
        if(intArr.length - 1 == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        intArr = Arrays.copyOf(intArr, intArr.length - 1);
    }

    public String toString() {
        return Arrays.stream(intArr)
                .asLongStream()
                .mapToObj(s -> String.valueOf(s))
                .collect(Collectors.joining());
    }
}

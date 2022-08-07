package structure.myQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(2);
        myQueue.add(3);
//        System.out.println(myQueue.arr[0]);
        myQueue.add(1);
 //       System.out.println(myQueue.arr[0]);
 //       System.out.println(myQueue.arr[1]);
        myQueue.add(10);
        System.out.println(myQueue.element());
    }
}

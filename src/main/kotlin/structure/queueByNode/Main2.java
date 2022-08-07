package structure.queueByNode;

public class Main2 {

    public static void main(String[] args){
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(10);
        myQueue.enQueue(20);
        System.out.println(myQueue);
        myQueue.deQueue();
        System.out.println(myQueue);
        myQueue.deQueue();
        myQueue.deQueue();
    }
}

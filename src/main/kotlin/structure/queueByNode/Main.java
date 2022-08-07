package structure.queueByNode;

public class Main {
    public static void main(String[] args) {
        MyNodeQueue<Integer> myNodeQueue = new MyNodeQueue(10);
        myNodeQueue.poll();
        System.out.println(myNodeQueue.peek());
    }
}

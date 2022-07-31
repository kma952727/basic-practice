package structure.stackByNode;

public class Main {

    public static void main(String[] args) {
        MyStack2<Integer> myStack2 = new MyStack2<Integer>(1);
        myStack2.push(2);
        myStack2.push(3);
        myStack2.pop();
        System.out.println(myStack2);
        myStack2.pop();
        System.out.println(myStack2);
        myStack2.pop();
        System.out.println(myStack2);
    }
}

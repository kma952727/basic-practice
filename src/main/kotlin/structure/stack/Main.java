package structure.stack;

import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args)
    {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack);
    }
}

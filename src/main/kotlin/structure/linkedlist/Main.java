package structure.linkedlist;

import java.util.LinkedList;

public class Main {

    /**
     * TODO
     * 1. param type Object -> Generic
     *
     * @param args
     */

    public static void main(String[] args)
    {
        MyLinkedList<Integer> linkedList = new MyLinkedList(1);
        linkedList.add(3);
        linkedList.add(10, 1);
        linkedList.addFirst(101);

        System.out.println( linkedList.contains(1124) );
    }
}

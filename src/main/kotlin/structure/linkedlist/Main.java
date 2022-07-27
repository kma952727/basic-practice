package structure.linkedlist;

public class Main {

    public static void main(String[] args)
    {
        MyLinkedList linkedList = new MyLinkedList(1);
        linkedList.add(3);
        linkedList.add(2, 1);
        System.out.println(linkedList);
    }
}

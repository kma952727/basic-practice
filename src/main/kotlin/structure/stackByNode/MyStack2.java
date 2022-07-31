package structure.stackByNode;

import structure.linkedlist.Node;

public class MyStack2<E> {
    private Node head;
    private int size;
    public MyStack2(final E data) {
        this.head = new Node<E>(data);
        size = 1;
    }

    public void push(final E data)
    {
        Node lastNode = getTail();
        lastNode.addNextNode(new Node(data));
        size++;
    }

    public void pop()
    {
        if(size == 1){
            head = null;
            size--;
            return;
        }
        Node currentNode = head;
        for(int i = 0; i < size - 2; i++){
            currentNode = currentNode.getNextNode();
        }
        currentNode.addNextNode(null);
        size--;
    }

    private Node getTail()
    {
        Node currentNode = head;
        while(currentNode.hasNextNode()){
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }
    @Override
    public String toString() {
        String result = "";
        Node currentNode = head;

        while (currentNode != null)
        {
            result += currentNode + ", ";
            if(!currentNode.hasNextNode()) break;
            currentNode = currentNode.getNextNode();
        }

        return result;
    }
}

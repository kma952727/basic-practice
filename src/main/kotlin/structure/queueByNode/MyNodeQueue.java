package structure.queueByNode;

import structure.linkedlist.Node;

public class MyNodeQueue<T>
{
    private Node<T> head;
    private int size;

    public MyNodeQueue(T element){
        head = new Node<T>(element);
        size = 1;
    }

    public void offer(T element) {
        Node<T> currentNode = head;
        if(currentNode.hasNextNode())
        {
            currentNode = currentNode.getNextNode();
        }
        currentNode.addNextNode(new Node(element));
    }

    public void poll() {
        if(size == 0) throw new NullPointerException();
        if(size == 1) {
            head = null;
            size--;
            return;
        }

        Node<T> prevNode = head;
        Node<T> currentNode = head.getNextNode();
        while(currentNode.hasNextNode()) {
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        prevNode.addNextNode(null);

    }

    public T peek() {
        if(size == 0) return null;
        return head.getValue();
    }
}

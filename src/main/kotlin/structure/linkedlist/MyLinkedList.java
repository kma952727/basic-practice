package structure.linkedlist;

import javax.swing.*;
import java.util.Collection;

public class MyLinkedList
{
    Node head;

    public MyLinkedList(final Object data)
    {
        head = new Node(data);
    }


    public boolean add(final Object data)
    {
        Node currentNode = travel();
        boolean isSuccess = currentNode.addNextNode(new Node(data));
        return isSuccess;
    }

    public boolean add(final Object data, final int index)
    {
        Node newNode = new Node(data);
        Node node = get(index);

        boolean isSuccessAddPrevNode = false;
        boolean isSuccessAddNextNode;

        if(index > 0)
        {
            Node prevNode = get(index - 1);
            isSuccessAddPrevNode = prevNode.addNextNode(newNode);
        }
        isSuccessAddNextNode = newNode.addNextNode(node);

        return isSuccessAddPrevNode && isSuccessAddNextNode;
    }

    public <E> boolean addAll(final Collection<? extends E> data)
    {
        Node tailsNode = travel();
        E[] dataArrayList = (E[])data.toArray();
        Node[] items = new Node[data.size()];
        Node prevNode = tailsNode;

        for (int i = 0; i < data.size() - 1; i++)
        {
            items[i] = new Node(dataArrayList[i]);
            boolean isSuccess = prevNode.addNextNode(items[i]);
            prevNode = items[i];
            if(!isSuccess) return false;
        }
        return true;
    }


    public Node get(final int index)
    {
        Node currentNode = head;
        for(int i = 0; i < index; i++) {
            if(!currentNode.hasNextNode()) throw new RuntimeException("out of index..! list lastIndex : " + i);
            currentNode = currentNode.nextNode;
        }
        return currentNode;
    }

    private Node travel()
    {
        Node currentNode = head;
        while (currentNode.hasNextNode()) {
            currentNode = currentNode.nextNode;
        }
        return currentNode;
    }

    @Override
    public String toString() {
        String result = "";
        Node currentNode = head;
        while (currentNode != null){
            result += currentNode + ", ";
            currentNode = currentNode.nextNode;
        }
        return result;
    }
}

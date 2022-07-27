package structure.linkedlist;

public class MyLinkedList
{
    Node head;

    public MyLinkedList(final Object data)
    {
        head = new Node(data);
    }


    public boolean add(final Object data)
    {
        Node currentNode = head;
        while (currentNode.hasNextNode()) {
            currentNode = currentNode.nextNode;
        }
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

    public Node get(final int index)
    {
        Node currentNode = head;
        for(int i = 0; i < index; i++) {
            if(!currentNode.hasNextNode()) throw new RuntimeException("out of index..! list lastIndex : " + i);
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

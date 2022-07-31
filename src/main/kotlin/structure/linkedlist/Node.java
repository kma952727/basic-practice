package structure.linkedlist;

public class Node<E>
{
    E data;
    Node<E> nextNode;

    public Node(E data)
    {
        this.data = data;
        this.nextNode = null;
    }

    boolean addNextNode(Node newNode)
    {
        this.nextNode = newNode;
        if(this.nextNode == newNode)
            return true;
        else
            return false;
    }

    boolean hasNextNode()
    {
        return this.nextNode != null;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

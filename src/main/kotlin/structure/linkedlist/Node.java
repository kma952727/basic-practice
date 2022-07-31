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

    public boolean addNextNode(Node newNode)
    {
        this.nextNode = newNode;
        if(this.nextNode == newNode)
            return true;
        else
            return false;
    }

    public boolean hasNextNode()
    {
        return this.nextNode != null;
    }
    public Node getNextNode() {
        if(nextNode == null) throw new RuntimeException("nextNode is null!");
        return nextNode;
    }
    @Override
    public String toString() {
        return data.toString();
    }
}

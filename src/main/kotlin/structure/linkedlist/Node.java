package structure.linkedlist;

public class Node
{
    Object data;
    Node nextNode;

    public Node(Object data)
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

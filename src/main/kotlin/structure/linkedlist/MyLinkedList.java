package structure.linkedlist;

import java.util.Collection;

/**
 * Object대신 Generic을 사용했습니다.
 * compile타이밍에 타입이 정해집니다. 런타임환경에서의 타입 캐스팅이 사라집니다.
 *
 * @param <E>
 */
public  class MyLinkedList<E>
{
    private Node head;
    private int size;

    public MyLinkedList(final E data)
    {
        head = new Node(data);
        size = 1;
    }


    public boolean add(final E data)
    {
        Node currentNode = travel();
        boolean isSuccess = currentNode.addNextNode(new Node(data));
        if(isSuccess) {
            this.size++;
            return true;
        }
        return false;
    }

    public boolean addFirst(final E data)
    {
        Node newNode = new Node(data);
        Node originHead = head;
        head = newNode;
        boolean isSuccess = head.addNextNode(originHead);

        if(isSuccess) {
            this.size++;
            return true;
        }
        return false;
    }

    public boolean remove( final int index )
    {
        if(index == 0) {    // HEAD

            if(size > 0) {
                Node nextNode = head.nextNode;
                head = nextNode;
            }else{
                head = null;
            }
        }else if( index == size - 1 ) {  // TAIL

            Node lastPrevNode = get( size - 2 );
            lastPrevNode.nextNode = null;
        }else if(index >= size) {   //  OUT

            throw new RuntimeException("범위 초과");
        }else {     //  BODY

            Node prevNode = get(index - 1);
            Node tempNode = prevNode.nextNode.nextNode;
            prevNode.addNextNode(tempNode);
        }
        size--;
        return true;
    }

    public int getSize()
    {
        return size;
    }

    public boolean add(final E data, final int index)
    {
        boolean isSuccessPrev = false;
        boolean isSuccessNext = false;

        Node newNode = new Node(data);
        Node node = null;

        if(index > 0)   //  Param index greater than 0 ( target: not head )
        {
            node = get(index);
            Node prevNode = get(index - 1);
            isSuccessPrev = prevNode.addNextNode(newNode);
            isSuccessNext = newNode.addNextNode(node);
        }else if(index == 0) {  //   Param index is zero ( target: head )
            node = head;
            head = newNode;
            isSuccessNext = head.addNextNode(node);
            isSuccessPrev = true;
        }
        if(isSuccessPrev && isSuccessNext) {
            size++;
            return true;
        }else{
            return false;
        }
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
        this.size += data.size();
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

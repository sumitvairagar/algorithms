package algo.lecture.queue;

public class GenericLinkedListBasedQueue<Item> implements Queue<Item> {

    Node head = null;
    Node tail = null;

    class Node{
        Item value;
        Node next;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void enqueue(Item item) {
        Node temp = new Node();
        temp.next = null;
        temp.value = item;
        if(tail != null)
            tail.next = temp;
        tail = temp;
        if(isEmpty()){
            head = tail;
        }
    }

    @Override
    public Item dequeue() {
        Item item = head.value;
        head = head.next;
        return item;
    }
}

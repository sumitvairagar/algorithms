package algo.lecture.queue;

public class LinkedListBasedStringQueue {


    Node tail = null;
    Node head = null;

    class Node{
        String value;
        Node next;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(String value){
        Node oldLast = tail;
        Node node = new Node();
        node.value = value;
        tail = node;

        if(isEmpty()){
            head = tail;
        }else{
            oldLast.next = tail;
        }
    }

    public String dequeue(){
        String value = head.value;
        head = head.next;
        return value;
    }
}

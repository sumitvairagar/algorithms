package algo.lecture.stack;

public class LinkedListBasedStringStack {

    private Node first = null;

    private class Node{
        String value;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String value) {
        Node oldFirst = first;
        first = new Node();
        first.value = value;
        first.next = oldFirst;
    }

    public String pop(){
        String value = first.value;
        first = first.next;
        return value;
    }
}

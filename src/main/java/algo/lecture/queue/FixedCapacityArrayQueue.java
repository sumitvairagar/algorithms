package algo.lecture.queue;

public class FixedCapacityArrayQueue implements Queue {

    private String data[];
    private int head = -1;
    private int tail = -1;

    public FixedCapacityArrayQueue(int size) {
        this.data = new String[size];
    }

    @Override
    public boolean isEmpty() {
        return head == -1;
    }

    @Override
    public void enqueue(String value) {
        data[++tail] = value;
        if(isEmpty()){
            head = tail;
        }
    }

    @Override
    public String dequeue() {
        String value = data[head];
        data[head++] = null;
        if(tail < head){
            head = -1;
            tail = -1;
        }
        return value;
    }
}

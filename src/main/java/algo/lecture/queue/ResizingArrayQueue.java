package algo.lecture.queue;

public class ResizingArrayQueue implements Queue {

    private final int INITIAL_SIZE = 1;

    private String data[];
    private int head = -1;
    private int tail = -1;

    public ResizingArrayQueue() {
        this.data = new String[INITIAL_SIZE];
    }

    @Override
    public boolean isEmpty() {
        return head == -1;
    }

    @Override
    public void enqueue(String value) {
        if(!isEmpty() && tail - head == data.length - 1) resize(data.length * 2);
        data[++tail] = value;
        if(isEmpty()){
            head = tail;
        }
    }

    private void resize(int newSize) {
        int count = head;
        String[] newData = new String[newSize];
        for(int i=0; i < newData.length; i++){
            if(count <= tail)
            newData[i] = data[count++];
        }
        head = 0;
        data = newData;
    }

    @Override
    public String dequeue() {
        String value = data[head];
        if(tail - head == data.length / 4) resize(data.length / 2);
        data[head++] = null;
        if(tail <= head){
            head = -1;
            tail = -1;
        }
        return value;
    }
}

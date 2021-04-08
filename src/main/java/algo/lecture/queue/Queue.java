package algo.lecture.queue;

public interface Queue<Item> {
     boolean isEmpty();
     void enqueue(Item value);
     Item dequeue();
}

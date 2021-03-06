package algo.lecture.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericLinkedListBasedQueueTest {

    @Test
    void checkIfQueueIsNotEmpty(){
        GenericLinkedListBasedQueue<String> queue = new GenericLinkedListBasedQueue<>();
        Assertions.assertEquals(true, queue.isEmpty());
        queue.enqueue("First Value");
        Assertions.assertEquals(false, queue.isEmpty());
    }

    @Test
    void checkIfQueueIsEmpty(){
        GenericLinkedListBasedQueue<String> queue = new GenericLinkedListBasedQueue<>();
        Assertions.assertEquals(true, queue.isEmpty());
        queue.enqueue("First Value");
        queue.dequeue();
        Assertions.assertEquals(true, queue.isEmpty());
    }

    @Test
    void testDeque(){
        GenericLinkedListBasedQueue<String> queue = new GenericLinkedListBasedQueue<>();
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");
        Assertions.assertEquals("First", queue.dequeue());
        Assertions.assertEquals("Second", queue.dequeue());
        Assertions.assertEquals("Third", queue.dequeue());
    }
}
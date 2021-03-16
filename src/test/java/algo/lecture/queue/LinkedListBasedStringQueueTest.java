package algo.lecture.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListBasedStringQueueTest {


    @Test
    void checkIfQueueIsNotEmpty(){
        LinkedListBasedStringQueue queue = new LinkedListBasedStringQueue();
        Assertions.assertEquals(true, queue.isEmpty());
        queue.enqueue("First Value");
        Assertions.assertEquals(false, queue.isEmpty());
    }

    @Test
    void checkIfQueueIsEmpty(){
        LinkedListBasedStringQueue queue = new LinkedListBasedStringQueue();
        Assertions.assertEquals(true, queue.isEmpty());
        queue.enqueue("First Value");
        queue.dequeue();
        Assertions.assertEquals(true, queue.isEmpty());
    }

    @Test
    void testDeque(){
        LinkedListBasedStringQueue queue = new LinkedListBasedStringQueue();
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");
        Assertions.assertEquals("First", queue.dequeue());
        Assertions.assertEquals("Second", queue.dequeue());
        Assertions.assertEquals("Third", queue.dequeue());
    }
}

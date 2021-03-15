package algo.lecture.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ResizingArrayStackTest {


    @Test
    void checkIfStackIsEmpty(){
        ResizingArrayStack stack = new ResizingArrayStack(10);
        Assertions.assertEquals(true, stack.isEmpty());
        stack.push("First Value");
        Assertions.assertEquals(false, stack.isEmpty());
    }

    @Test
    void testPopping(){
        ResizingArrayStack stack = new ResizingArrayStack(10);
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        Assertions.assertEquals("Third", stack.pop());
        Assertions.assertEquals("Second", stack.pop());
        Assertions.assertEquals("First", stack.pop());
    }

    @Test
    void checkOverflow(){
        ResizingArrayStack stack = new ResizingArrayStack(2);
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
    }
}
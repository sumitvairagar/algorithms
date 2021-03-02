package algo.lecture.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringStackTest {

    @Test
    void checkIfStackIsEmpty(){
        StringStack stack = new StringStack();
        Assertions.assertEquals(true, stack.isEmpty());
        stack.push("First Value");
        Assertions.assertEquals(false, stack.isEmpty());
    }

    @Test
    void testPopping(){
        StringStack stack = new StringStack();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        Assertions.assertEquals("Third", stack.pop());
        Assertions.assertEquals("Second", stack.pop());
        Assertions.assertEquals("First", stack.pop());
    }
}

package geekforgeek.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Test
    public void reverseHello(){
        char[] s = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] expected = new char[] { 'o', 'l', 'l', 'e', 'H'};
        ReverseString reverseString = new ReverseString();
        Assertions.assertEquals(new String(expected), new String(reverseString.reverseString(s)));
    }
}

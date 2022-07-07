package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    public void shouldReturn1WhenSymbolIsI(){
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(1, romanToInteger.romanToInt("I"));
    }

    @Test
    public void shouldReturn5WhenSymbolIsV(){
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(5, romanToInteger.romanToInt("V"));
    }

    @Test
    public void shouldReturn3WhenSymbolIsIII(){
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    public void shouldReturn6WhenSymbolIsVI(){
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(6, romanToInteger.romanToInt("VI"));
    }

    @Test
    public void shouldReturn58WhenSymbolIsLVIII(){
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }


    @Test
    public void shouldReturn4WhenSymbolIsIV(){
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(4, romanToInteger.romanToInt("IV"));
    }



    @Test
    public void shouldReturn1994WhenSymbolIsMCMXCIV(){
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}
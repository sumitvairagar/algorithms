package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    public void shouldReturnPrefix(){
        String[] strs = new String[] {"flower","flow","flight"};
        LongestCommonPrefix commonPrefix = new LongestCommonPrefix();
        Assertions.assertEquals("fl", commonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void shouldNotReturnPrefix(){
        String[] strs = new String[] {"Sumit","Vinit","Rohit"};
        LongestCommonPrefix commonPrefix = new LongestCommonPrefix();
        Assertions.assertEquals("", commonPrefix.longestCommonPrefix(strs));
    }

}
package scaler.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import scaler.interviewproblems.JosephusProblem;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubStringTest {

    @Test
    void solve() {
        LongestPalindromicSubString longestPalindromicSubString = new LongestPalindromicSubString();


        Assertions.assertEquals("bb", longestPalindromicSubString.longestPalindrome("abb"));
    }

    @Test
    void solve2() {
        LongestPalindromicSubString longestPalindromicSubString = new LongestPalindromicSubString();


        Assertions.assertEquals("aaabaaa", longestPalindromicSubString.longestPalindrome("aaaabaaa"));
    }
}

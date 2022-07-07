package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void is1APalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertEquals(true, palindromeNumber.isPalindrome(1));
    }

    @Test
    void is121APalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertEquals(true, palindromeNumber.isPalindrome(121));
    }


    @Test
    void is1213APalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertEquals(false, palindromeNumber.isPalindrome(1213));
    }

}
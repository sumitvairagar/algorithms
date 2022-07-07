package leetcode.easy;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String numberAsString = String.valueOf(x); // Space o(1)
        if(numberAsString.length() == 1) return true;

        // 1 - Convert to String - done
        // 2 - Traverse using two pointer methods and compare
        int i = 0;
        int j = numberAsString.length() - 1;
        while(i < j){
            // o(n/2) ---> o(n)
            if(numberAsString.charAt(i) != numberAsString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

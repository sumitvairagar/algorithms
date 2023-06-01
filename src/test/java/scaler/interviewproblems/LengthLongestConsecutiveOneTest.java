package scaler.interviewproblems;

import geekforgeek.easy.array.scaler.ColumnSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthLongestConsecutiveOneTest {

    @Test
    void solve() {
        LengthLongestConsecutiveOne lengthLongestConsecutiveOne = new LengthLongestConsecutiveOne();

       String A = "111011101";

        Assertions.assertEquals(7, lengthLongestConsecutiveOne.solve(A));
    }
}
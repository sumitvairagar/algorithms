package scaler.hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumEqualsBTest {

    @Test
    void solve3() {
        SubarraySumEqualsB subarraySumEqualsB = new SubarraySumEqualsB();
        int[] A = new int[] { 1, 2, 3, 4};
        int B = 5;
        Assertions.assertEquals(1, subarraySumEqualsB.solve(A, B));
    }
}
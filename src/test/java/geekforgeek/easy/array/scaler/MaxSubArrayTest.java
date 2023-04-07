package geekforgeek.easy.array.scaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {
    @Test
    public void maxSubArrayTest(){
        MaxSubArray productArray = new MaxSubArray();
        int A = 9;
        int B = 14;
        int[] C = new int[] { 1, 2, 4, 4, 5, 5, 5, 7, 5 };

        Assertions.assertEquals(14, productArray.maxSubarray(A, B, C));
    }

}
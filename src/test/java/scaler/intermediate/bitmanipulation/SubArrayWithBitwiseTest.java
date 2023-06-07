package scaler.intermediate.bitmanipulation;

import geekforgeek.easy.array.scaler.Subarrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayWithBitwiseTest {

    @Test
    public void subArrayWithBitwiseTest() {
        SubArrayWithBitwise subArrayWithBitwiseTest = new SubArrayWithBitwise();

        int A = 5;
        int[] B = { 0, 1, 1, 0, 1};


        Assertions.assertEquals(13, subArrayWithBitwiseTest.solve(A, B));
    }

}
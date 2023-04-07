package geekforgeek.easy.array.scaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraysTest {

    @Test
    public void subArrays() {
        Subarrays subarrays = new Subarrays();

        int[] A = { 36, 63, 63, 26, 87, 28, 77, 93, 7};
        int[][] B = new int[][]{
                {1},
                {1, 2},
                {1, 2, 3},
                {2},
                {2, 3},
                {3}
        };

        Assertions.assertArrayEquals(B, subarrays.solve(A));
    }


    @Test
    public void subArraysTestTwo() {
        Subarrays subarrays = new Subarrays();

        int[] A = { 1, 2, 3, 4};
        int[][] B = new int[][]{
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4},
                {2},
                {2, 3},
                {2, 3, 4},
                {3},
                {3, 4},
                {4}
        };

        Assertions.assertArrayEquals(B, subarrays.solve(A));
    }
}
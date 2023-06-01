package scaler.interviewproblems;

import geekforgeek.easy.array.scaler.ProductArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountIncreasingTripletsTest {

    @Test
    void solve() {
        CountIncreasingTriplets countIncreasingTriplets = new CountIncreasingTriplets();
        int[] A = new int[] { 26, 23, 23, 16, 27, 18, 7 };

        Assertions.assertEquals(0, countIncreasingTriplets.solve(A));
    }
}
package geekforgeek.easy.array.scaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateallsubarraysTest {
    @Test
    public void generateAllSubArrays(){
        Generateallsubarrays generateallsubarrays = new Generateallsubarrays();

        int[] A = new int[] { 3562,42160,37854,48802,71740,61054,54878,20487};
        int[][] C = new int[][]{ {1}, {1, 2}, {1, 2, 3}, {2}, {2, 3}, {3}};

        Assertions.assertArrayEquals(C, generateallsubarrays.solve(A));
    }
}
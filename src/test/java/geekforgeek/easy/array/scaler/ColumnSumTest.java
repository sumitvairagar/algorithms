package geekforgeek.easy.array.scaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColumnSumTest {

    @Test
    public void columnSum(){
        ColumnSum columnSum = new ColumnSum();

        int[][] C = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 3, 4}
        };

        Assertions.assertArrayEquals(new int[]{15, 10 ,13, 16 }, columnSum.solve(C));
    }
}
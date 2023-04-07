package geekforgeek.easy.array.scaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {

    @Test
    public void generateMatrix() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        int[][] A = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };

        Assertions.assertArrayEquals(A, spiralMatrix.generateMatrix(3));
    }

    @Test
    public void generateMatrix2() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        int[][] A = new int[][]{
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7},
        };

        Assertions.assertArrayEquals(A, spiralMatrix.generateMatrix(4));
    }
}
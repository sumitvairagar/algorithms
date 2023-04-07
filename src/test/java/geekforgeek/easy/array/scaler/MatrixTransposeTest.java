package geekforgeek.easy.array.scaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTransposeTest {

    @Test
    public void columnSum() {
        MatrixTranspose matrixTranspose = new MatrixTranspose();

        int[][] A = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] B = new int[][]{
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        Assertions.assertArrayEquals(B, matrixTranspose.solve(A));
    }
}
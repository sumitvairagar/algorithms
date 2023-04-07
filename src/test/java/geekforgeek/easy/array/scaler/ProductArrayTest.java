package geekforgeek.easy.array.scaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductArrayTest {

    @Test
    public void productArrayTest(){
        ProductArray productArray = new ProductArray();
        int[] A = new int[] { 1, 2, 3, 4, 5 };

        Assertions.assertArrayEquals(new int[]{120, 60, 40, 30, 24}, productArray.solve(A));
    }
}
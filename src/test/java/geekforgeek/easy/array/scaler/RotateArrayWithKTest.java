package geekforgeek.easy.array.scaler;

import geekforgeek.easy.array.RotateArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayWithKTest {


    @Test
    public void rotateArrayWith3ElementsBy1(){
        RotateArrayWithK rotateArray = new RotateArrayWithK();
        int[] arr = new int[] { 1, 2, 3};
        Assertions.assertArrayEquals(new int[] {3, 1, 2}, rotateArray.solve(arr, 1));
    }


}
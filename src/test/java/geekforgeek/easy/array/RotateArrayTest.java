package geekforgeek.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

    @Test
    public void rotateArrayWith3ElementsBy1(){
        RotateArray rotateArray = new RotateArray();
        int[] arr = new int[] { 1, 2, 3};
        Assertions.assertArrayEquals(new int[] {3, 1, 2}, rotateArray.rotate(arr, 1));
    }

    @Test
    public void rotateArrayWith7ElementsBy3(){
        RotateArray rotateArray = new RotateArray();
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7};
        int[] expected = new int[] {5, 6, 7, 1, 2, 3, 4};
        int[] result = rotateArray.rotate(arr, 3);
        Assertions.assertArrayEquals(expected, result);
        Assertions.assertEquals(expected.length, result.length);
    }
}
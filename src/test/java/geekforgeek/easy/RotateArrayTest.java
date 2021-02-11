package geekforgeek.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    public void rotateArrayWith3ElementsBy1(){
        RotateArray rotateArray = new RotateArray();
        int[] arr = new int[] { 1, 2, 3};
        Assertions.assertArrayEquals(new int[] {3, 1, 2}, rotateArray.rotate(arr, 1));
    }

    @Test
    public void rotateArrayWith7ElementsBy2(){
        RotateArray rotateArray = new RotateArray();
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(new int[] {6, 7, 1, 2, 3, 4, 5}, rotateArray.rotate(arr, 2));
    }
}
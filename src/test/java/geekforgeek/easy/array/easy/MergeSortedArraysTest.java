package geekforgeek.easy.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArraysTest {

    @Test
    public void mergeSortedArrays(){
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
        int[] array1 = new int[] { 1, 3, 5, 0, 0, 0 };
        int[] array2 = new int[] { 2, 4, 6 };

        Assertions.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6}, mergeSortedArrays.merge(array1, array1.length - array2.length, array2, array2.length));
    }
}
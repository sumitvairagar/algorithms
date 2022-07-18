package geekforgeek.easy.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArraysTest {

    @Test
    public void mergeSortedArrays(){
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
        int[] array1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] array2 = new int[] { 1, 2, 3 };

        Assertions.assertArrayEquals(new int[] {1, 1, 2, 2, 3, 3}, mergeSortedArrays.merge(array1, array1.length - array2.length, array2, array2.length));
    }
}
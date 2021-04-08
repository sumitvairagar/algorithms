package algo.lecture.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

    @Test
    public void testSortingOfTwoElements(){
        int[] toSort = new int[] { 2, 1 };
        InsertionSort sort = new InsertionSort();
        Assertions.assertArrayEquals(new int[] {1, 2}, sort.sort(toSort));
    }

    @Test
    public void testSortingOfTenElements(){
        int[] toSort = new int[] { 2, 1, 4, 3, 9, 5, 6, 7,8 };
        InsertionSort sort = new InsertionSort();
        Assertions.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, sort.sort(toSort));
    }
}
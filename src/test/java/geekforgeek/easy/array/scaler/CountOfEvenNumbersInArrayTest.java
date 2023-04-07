package geekforgeek.easy.array.scaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountOfEvenNumbersInArrayTest {

    @Test
    public void countOfEvenNumbers(){
        CountOfEvenNumbersInArray secondLargestNumber = new CountOfEvenNumbersInArray();
        int[] A = new int[] { 6, 3, 3, 6, 7, 8, 7, 3, 7 };
        int[][] B = new int[][]{ {2, 6}, {4, 7}, {6, 7}};
        Assertions.assertArrayEquals(new int[]{2, 1 , 0 }, secondLargestNumber.solve(A, B));
    }

}
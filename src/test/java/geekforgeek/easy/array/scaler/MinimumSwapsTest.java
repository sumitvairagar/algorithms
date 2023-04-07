package geekforgeek.easy.array.scaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSwapsTest {

    @Test
    public void minimumSwapsLessthanB(){
        MinimumSwaps minimumSwaps = new MinimumSwaps();
        int[] arr = new int[] { 1, 12, 10, 3, 14, 10, 5};
        int B = 8;
        Assertions.assertEquals(2, minimumSwaps.solve(arr, B));
    }

    @Test
    public void minimumSwapsLessthanB2(){
        MinimumSwaps minimumSwaps = new MinimumSwaps();
        int[] arr = new int[] { 5, 17, 100, 11};
        int B = 20;
        Assertions.assertEquals(1, minimumSwaps.solve(arr, B));
    }

    @Test
    public void minimumSwapsLessthanB3(){
        MinimumSwaps minimumSwaps = new MinimumSwaps();
        int[] arr = new int[] { 52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84, 27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22, 27, 74, 78, 38, 11, 65, 29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70};
        int B = 19;
        Assertions.assertEquals(7, minimumSwaps.solve(arr, B));
    }

}
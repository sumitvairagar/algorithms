package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberInArrayTest {
    SingleNumberInArray singleNumberInArray = new SingleNumberInArray();
    @Test
    public void whenSizeIs1(){
        Assertions.assertEquals(1, singleNumberInArray.singleNumber(new int[] {1}));
    }

    @Test
    public void whenSizeIs2WithRepeatedElement(){
        Assertions.assertEquals(0, singleNumberInArray.singleNumber(new int[] {1, 1}));
    }

    @Test
    public void whenSizeIs3WithRepeatedElementAndUnique(){
        Assertions.assertEquals(2, singleNumberInArray.singleNumber(new int[] {1, 1, 2}));
    }


    @Test
    public void whenSizeIs7WithRepeatedElementAndUnique(){
        Assertions.assertEquals(9, singleNumberInArray.singleNumber(new int[] {9, 1, 1, 2, 2, 8, 8 }));
    }
}
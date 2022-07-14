package geekforgeek.easy.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneInArrayTest {

    @Test
    public void shouldReturnPlusOneInArrayWhenSizeIsOne(){
        int[] nums = new  int[] { 1 };
        PlusOneInArray plusOneInArray = new PlusOneInArray();
        int[] result = plusOneInArray.plusOne(nums);
        Assertions.assertEquals(1, result.length);
        Assertions.assertEquals(2, result[0]);
    }

    @Test
    public void shouldReturnPlusOneInArrayWhenSizeIsTwo(){
        int[] nums = new  int[] { 1, 2 };
        PlusOneInArray plusOneInArray = new PlusOneInArray();
        int[] result = plusOneInArray.plusOne(nums);
        Assertions.assertEquals(2, result.length);
        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(3, result[1]);
    }

    @Test
    public void shouldReturnPlusOneInArrayWhenSizeIsThree(){
        int[] nums = new  int[] { 1, 2, 3 };
        PlusOneInArray plusOneInArray = new PlusOneInArray();
        int[] result = plusOneInArray.plusOne(nums);
        Assertions.assertEquals(3, result.length);
        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(2, result[1]);
        Assertions.assertEquals(4, result[2]);
    }


    @Test
    public void shouldReturnPlusOneInArrayWhenSizeIsOneAndLastDigitIs9(){
        int[] nums = new  int[] { 9 };
        PlusOneInArray plusOneInArray = new PlusOneInArray();
        int[] result = plusOneInArray.plusOne(nums);
        Assertions.assertEquals(2, result.length);
        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(0, result[1]);
    }

    @Test
    public void shouldReturnPlusOneInArrayWhenSizeIsOneAndLastDigitIs999(){
        int[] nums = new  int[] { 9, 9 , 9 };
        PlusOneInArray plusOneInArray = new PlusOneInArray();
        int[] result = plusOneInArray.plusOne(nums);
        Assertions.assertEquals(4, result.length);
        Assertions.assertEquals(0, result[3]);
        Assertions.assertEquals(0, result[2]);
        Assertions.assertEquals(0, result[1]);
        Assertions.assertEquals(1, result[0]);
    }

    @Test
    public void shouldReturnPlusOneInArrayWhenSizeIsOneAndLastDigitIs1999(){
        int[] nums = new  int[] { 1, 9, 9 , 9 };
        PlusOneInArray plusOneInArray = new PlusOneInArray();
        int[] result = plusOneInArray.plusOne(nums);
        Assertions.assertEquals(4, result.length);
        Assertions.assertEquals(0, result[3]);
        Assertions.assertEquals(0, result[2]);
        Assertions.assertEquals(0, result[1]);
        Assertions.assertEquals(2, result[0]);
    }

}
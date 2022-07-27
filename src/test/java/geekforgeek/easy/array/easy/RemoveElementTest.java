package geekforgeek.easy.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    public void removeElementWithArraySize4(){
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int actual = removeElement.removeElement(nums, 3);
        Assertions.assertEquals(2, actual);
        Assertions.assertArrayEquals(new int[]{2, 2, 2, 3}, nums );
    }


    @Test
    public void removeElementWithArraySize8(){
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {0,1,2,2,3,0,4,2};
        int actual = removeElement.removeElement(nums, 2);
        Assertions.assertEquals(5, actual);
        Assertions.assertArrayEquals(new int[]{0, 1, 3, 0, 4, 0, 4, 2}, nums );
    }

    @Test
    public void removeElementWithArraySize1(){
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {1};
        int actual = removeElement.removeElement(nums, 1);
        Assertions.assertEquals(0, actual);
        Assertions.assertArrayEquals(new int[]{1}, nums );
    }
}
package geekforgeek.easy.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateFromSortedArrayTest {

    @Test
    public void returnIndex0IfArrayIsEmpty(){
        int empty[] = {};
        RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray = new RemoveDuplicateFromSortedArray();
        Assertions.assertEquals(0, removeDuplicateFromSortedArray.removeDuplicates(empty));
    }


    @Test
    public void returnIndex3IfArrayIsEmpty(){
        int array[] = {4, 3, 3, 2, 1};
        RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray = new RemoveDuplicateFromSortedArray();
        Assertions.assertEquals(3, removeDuplicateFromSortedArray.removeDuplicates(array));
    }


    @Test
    public void returnIndex6IfArrayIsEmpty(){
        int array[] = {6, 6, 6, 5,4, 3, 3, 2, 2, 1, 1};
        RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray = new RemoveDuplicateFromSortedArray();
        Assertions.assertEquals(5, removeDuplicateFromSortedArray.removeDuplicates(array));
    }
}
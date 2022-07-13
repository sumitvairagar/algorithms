package geekforgeek.easy.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    public void shouldReturnIndexWhenTargetIsFound(){
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int result = searchInsertPosition.searchInsert(new int[]{1, 2, 3}, 2);
        Assertions.assertEquals(1, result);
    }
    @Test
    public void shouldReturnIndexWhenTargetIsFoundTwo(){
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int result = searchInsertPosition.searchInsert(new int[]{1, 2, 3, 4, 5, 6}, 4);
        Assertions.assertEquals(3, result);
    }


    @Test
    public void shouldReturnIndexPositionWhenTargetIsNotFound(){
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int result = searchInsertPosition.searchInsert(new int[]{1, 3}, 2);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void shouldReturnIndexPositionWhenTargetIsNotFoundTwo(){
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int result = searchInsertPosition.searchInsert(new int[]{1, 2, 3, 4, 5, 7 , 8}, 6);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void shouldReturnIndexPositionWhenTargetIsNotFoundThree(){
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int result = searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 7);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void shouldReturnIndexPositionWhenTargetIsNotFoundFour(){
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int result = searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 0);
        Assertions.assertEquals(0, result);
    }

}
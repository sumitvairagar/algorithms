package geekforgeek.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {

    @Test
    public void shouldReturnFalseIfArrayIsEmpty(){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] empty = new int[] { };
        Assertions.assertEquals(false, containsDuplicate.containsDuplicate(empty));
    }

    @Test
    public void shouldReturnFalseIfArrayHasSingleElement(){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] empty = new int[] { 1 };
        Assertions.assertEquals(false, containsDuplicate.containsDuplicate(empty));
    }

    @Test
    public void shouldReturnTrueIfArrayHasRepeatingElements(){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] empty = new int[] { 1, 1 };
        Assertions.assertEquals(true, containsDuplicate.containsDuplicate(empty));
    }

    @Test
    public void shouldReturnTrueIfArrayHasRepeatingElementsPartTwo(){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] empty = new int[] { 1, 2, 3, 4, 1 };
        Assertions.assertEquals(true, containsDuplicate.containsDuplicate(empty));
    }
}

package geekforgeek.easy.array.scaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestNumberTest {

    @Test
    public void secondLargestSum(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int[] arr = new int[] { 81705, 56002, 87239, 11815, 31420, 38036, 62002, 69224, 67185, 75478, 42577, 79358 };
        Assertions.assertEquals(81705, secondLargestNumber.solve(arr));
    }
}
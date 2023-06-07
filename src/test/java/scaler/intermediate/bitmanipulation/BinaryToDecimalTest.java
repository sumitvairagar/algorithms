package scaler.intermediate.bitmanipulation;

import geekforgeek.easy.array.scaler.RotateArrayWithK;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToDecimalTest {
    @Test
    public void binaryToDecimalTest(){
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();

        Assertions.assertEquals(10, binaryToDecimal.solve(1010, 2));
    }

}
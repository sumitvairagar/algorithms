package scaler.intermediate.bitmanipulation;

import geekforgeek.easy.array.scaler.RotateArrayWithK;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToPowerOfAnyBaseTest {

    @Test
    public void decimalToPowerOfBaseOf2(){
        DecimalToPowerOfAnyBase decimalToPowerOfAnyBase = new DecimalToPowerOfAnyBase();

        Assertions.assertEquals(1010, decimalToPowerOfAnyBase.decimalToAnyBase(10, 2));
    }

    @Test
    public void decimalToPowerOfBaseOf3(){
        DecimalToPowerOfAnyBase decimalToPowerOfAnyBase = new DecimalToPowerOfAnyBase();

        Assertions.assertEquals(11, decimalToPowerOfAnyBase.decimalToAnyBase(4, 3));
    }


}
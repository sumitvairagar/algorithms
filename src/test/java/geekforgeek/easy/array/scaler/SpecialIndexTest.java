package geekforgeek.easy.array.scaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialIndexTest {

    @Test
    public void specialIndex(){
        SpecialIndex specialIndex = new SpecialIndex();
        int[] A = new int[] { 2, 1, 6, 4 };

        Assertions.assertEquals(1, specialIndex.solve(A));
    }



    @Test
    public void specialIndex2(){
        SpecialIndex specialIndex = new SpecialIndex();
        int[] A = new int[] { 1, 2, 3, 4, 5, 6, 13, 1, 2, 3, 4, 5, 6  };

        Assertions.assertEquals(0, specialIndex.solve(A));
    }
}
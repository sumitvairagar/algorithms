package scaler.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterTrapTest {

    @Test
    public void waterTrapped(){
        int[] A = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        WaterTrap waterTrap = new WaterTrap();
        Assertions.assertEquals(6, waterTrap.trap(A));
    }

}
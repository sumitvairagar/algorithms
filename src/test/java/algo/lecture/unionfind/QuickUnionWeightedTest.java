package algo.lecture.unionfind;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickUnionWeightedTest {

    @Test
    public void testInitialization(){
        QuickUnionWeighted qf = new QuickUnionWeighted(4);
        Assertions.assertEquals("[0, 1, 2, 3]", qf.printArray());
    }

    @Test
    public void testUnion(){
        QuickUnionWeighted qf = new QuickUnionWeighted(8);
        qf.union(1, 2);
        qf.union(3, 4);
        qf.union(3, 7);
        qf.union(5, 0);
        qf.union(4, 0);
        Assertions.assertEquals(true, qf.isConnected(1, 2));
        Assertions.assertEquals(true, qf.isConnected(7, 4));
        Assertions.assertEquals(true, qf.isConnected(7, 0));
        Assertions.assertEquals(false, qf.isConnected(0, 2));
    }
}

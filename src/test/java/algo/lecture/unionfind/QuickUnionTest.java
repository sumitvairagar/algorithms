package algo.lecture.unionfind;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickUnionTest {

    @Test
    public void testInitialization(){
        QuickFind qf = new QuickFind(4);
        Assertions.assertEquals("[0, 1, 2, 3]", qf.printArray());
    }

    @Test
    public void testUnion(){
        QuickFind qf = new QuickFind(8);
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

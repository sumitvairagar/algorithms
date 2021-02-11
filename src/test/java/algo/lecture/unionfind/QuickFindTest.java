package algo.lecture.unionfind;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickFindTest {

    @Test
    public void testInitialization(){
        QuickFind qf = new QuickFind(4);
        Assertions.assertEquals("[0, 1, 2, 3]", qf.printArray());
    }

    @Test
    public void testUnion(){
        QuickFind qf = new QuickFind(4);
        qf.union(1, 2);
        qf.union(3, 2);
        Assertions.assertEquals(true, qf.isConnected(1, 2));
        Assertions.assertEquals(true, qf.isConnected(3, 2));
        Assertions.assertEquals(false, qf.isConnected(0, 2));
    }
}

package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangle2Test {

    PascalsTriangle2 pascalsTriangle2 = new PascalsTriangle2();

    @Test
    public void whenSizeIs0(){
        List<Integer> result = pascalsTriangle2.getRow(0);
        Assertions.assertEquals(List.of(1),result);
    }


    @Test
    public void whenSizeIs1(){
        List<Integer> result = pascalsTriangle2.getRow(1);
        Assertions.assertEquals(List.of(1, 1),result);
    }

    @Test
    public void whenSizeIs2(){
        List<Integer> result = pascalsTriangle2.getRow(2);
        Assertions.assertEquals(List.of(1, 2, 1),result);
    }

    @Test
    public void whenSizeIs3(){
        List<Integer> result = pascalsTriangle2.getRow(3);
        Assertions.assertEquals(List.of(1, 3, 3, 1),result);
    }


    @Test
    public void whenSizeIs4(){
        List<Integer> result = pascalsTriangle2.getRow(4);
        Assertions.assertEquals(List.of(1, 4, 6, 4, 1),result);
    }

}
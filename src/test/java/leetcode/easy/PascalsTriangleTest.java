package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {

    PascalsTriangle pascalsTriangle = new PascalsTriangle();
    @Test
    public void whenSizeIs0(){
        List<List<Integer>> result = pascalsTriangle.generate(0);
        Assertions.assertEquals(null,result);
    }

    @Test
    public void whenSizeIs1(){
        List<List<Integer>> result = pascalsTriangle.generate(1);
        Assertions.assertEquals(List.of(List.of(1)),result);
    }


    @Test
    public void whenSizeIs2(){
        List<List<Integer>> result = pascalsTriangle.generate(2);
        Assertions.assertEquals(List.of(List.of(1), List.of(1, 1)),result);
    }

    @Test
    public void whenSizeIs3(){
        List<List<Integer>> result = pascalsTriangle.generate(3);
        Assertions.assertEquals(List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1)),result);
    }

    @Test
    public void whenSizeIs4(){
        List<List<Integer>> result = pascalsTriangle.generate(4);
        Assertions.assertEquals(List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1)),result);
    }


    @Test
    public void whenSizeIs5(){
        List<List<Integer>> result = pascalsTriangle.generate(5);
        Assertions.assertEquals(List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1)),result);
    }
}
package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {

    SummaryRanges summaryRanges = new SummaryRanges();
    @Test
    public void whenSizeIsOne(){
        int[] nums = new int[] {1};
        Assertions.assertEquals(List.of("1"), summaryRanges.summaryRanges(nums));
    }

    @Test
    public void whenSizeIsTwo(){
        int[] nums = new int[] {1, 2};
        Assertions.assertEquals(List.of("1->2"), summaryRanges.summaryRanges(nums));
    }

}
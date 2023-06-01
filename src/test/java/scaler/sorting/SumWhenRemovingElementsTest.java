package scaler.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import scaler.interviewproblems.JosephusProblem;

import static org.junit.jupiter.api.Assertions.*;

class SumWhenRemovingElementsTest {

    @Test
    void solve() {
        SumWhenRemovingElements sumWhenRemovingElementsTest = new SumWhenRemovingElements();
        int[] A = new int[] { 8, 0, 10  };

        Assertions.assertEquals(26, sumWhenRemovingElementsTest.solve(A));
    }
}
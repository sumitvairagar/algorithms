package scaler.hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import scaler.interviewproblems.JosephusProblem;

import static org.junit.jupiter.api.Assertions.*;

class PairWithGivenDifferenceTest {
    @Test
    void solve() {
        PairWithGivenDifference pairWithGivenDifference = new PairWithGivenDifference();
        int[] A = new int[] {90, 497, -411, 990, 145, 353, 314, -349, -260, -956, 258, -665, -241, 192, 605, 264, -819, -497, 829, 775, -392, 292, 997, 549, 556, 561, 627, -533, 541, -871, 240, 813, 174, -399, -923, -785};
        int B = -466;
        Assertions.assertEquals(1, pairWithGivenDifference.solve(A, B));
    }

    @Test
    void solve2() {
        PairWithGivenDifference pairWithGivenDifference = new PairWithGivenDifference();
        int[] A = new int[] { -698, 371, -534, -322, -407, 851, 484, 18, -536 };
        int B = -36;
        Assertions.assertEquals(0, pairWithGivenDifference.solve(A, B));
    }

    @Test
    void solve3() {
        PairWithGivenDifference pairWithGivenDifference = new PairWithGivenDifference();
        int[] A = new int[] { 20, 500, 1000, 200 };
        int B = -36;
        Assertions.assertEquals(0, pairWithGivenDifference.solve(A, B));
    }


}
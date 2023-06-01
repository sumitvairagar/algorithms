package scaler.interviewproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JosephusProblemTest {
    @Test
    void solve() {
        JosephusProblem josephusProblem = new JosephusProblem();


        Assertions.assertEquals(3, josephusProblem.solve(5));
    }
}
package scaler.hashing;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsB {
    public int solve(int[] A, int B) {
        Map<Integer, Integer> prevSum = new HashMap<Integer, Integer>();
        prevSum.put(0, 1);
        int currSum = 0, ans = 0;
        for(int i = 0 ; i < A.length ; i++){
            currSum += A[i];
            if(prevSum.containsKey(currSum - B)){
                ans += prevSum.get(currSum - B);
            }
            prevSum.put(currSum, prevSum.getOrDefault(currSum, 0) + 1);
        }
        return ans;
    }
}

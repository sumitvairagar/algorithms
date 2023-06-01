package scaler.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PairWithGivenDifference {
    public int solve(int[] A, int B) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < A.length ; i++){
            if(set.contains(A[i] + B) || set.contains(A[i] - B)){
                return 1;
            }
            set.add(A[i]);
        }
        return 0;
    }
}

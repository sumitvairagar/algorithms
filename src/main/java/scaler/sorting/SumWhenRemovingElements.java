package scaler.sorting;

import java.util.Arrays;

public class SumWhenRemovingElements {
    public int solve(int[] A) {
        Arrays.sort(A);
        int[] prefixSum = new int[A.length];
        prefixSum[0] = A[0];
        for(int i = 1; i < A.length; i++){
            prefixSum[i] = A[i] + prefixSum[i - 1];
        }
        int ans = 0;
        for(int i = 0; i < prefixSum.length; i++){
            ans = ans + prefixSum[i];
        }
        return ans;
    }
}

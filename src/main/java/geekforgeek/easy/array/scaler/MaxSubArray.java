package geekforgeek.easy.array.scaler;

public class MaxSubArray {
    public int maxSubarray(int A, int B, int[] C) {
        int ans = 0;
        for (int i = 0; i < A; i++) {
            int sum = 0;
            for (int j = i; j < A; j++) {
                sum += C[j];
                if (sum <= B)
                    ans = Math.max(ans, sum);
                else break;
            }
        }
        return ans;
    }
}

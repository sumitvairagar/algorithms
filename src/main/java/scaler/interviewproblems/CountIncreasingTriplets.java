package scaler.interviewproblems;

public class CountIncreasingTriplets {
    public int solve(int[] A) {
        int i = 0;
        int j = 0;
        int k = 0;

        int ans = 0;
        int N = A.length;
        while( i < N - 1){
            int left = 0;
            int right = 0;

            j = i - 1;
            while(j >= 0){
                if(A[j] < A[i]) {
                    left++;
                }
                j--;
            }
            k = i + 1;
            while(k < N){
                if(A[k] > A[i]) {
                    right++;
                }
                k++;
            }

            ans += (left * right);

            i++;
        }
        return ans;
    }
}

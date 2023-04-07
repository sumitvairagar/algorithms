package geekforgeek.easy.array.scaler;

public class MinimumSwaps {
    public int solve(int[] A, int B) {
        //[1, 12, 10, 3, 14, 10, 5]
        int totalLessThanB = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] <= B) totalLessThanB++;
        }

        int swap = 0;
        for(int i = 0; i < totalLessThanB; i++){
            if(A[i] > B) swap++;
        }
        int ans = swap;
        int start = 1;
        int end = totalLessThanB;
        while(end < A.length){
            if(A[start - 1] > B) swap--;
            if(A[end] > B ) swap++;
            start++;
            end++;
            ans = Math.min(ans, swap);
        }
        return ans;
    }
}

package geekforgeek.easy.array.scaler;

public class Subarrays {
    public int[][] solve(int[] A) {
        int n = (A.length * (A.length + 1)) / 2;
        int[][] ans = new int[n][];
        int ansRow = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = i; j < A.length; j++){
                int[] temp = new int[j - i + 1];
                int tempCount = 0;
                for(int k=i; k <= j; k++){
                    temp[tempCount++] = A[k];
                }
                ans[ansRow] = temp;
                ansRow++;
            }
        }
        return ans;
    }
}

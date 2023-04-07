package geekforgeek.easy.array.scaler;

public class ColumnSum {
    public int[] solve(int[][] A) {

        int[] ans = new int[A[0].length];
        int i = 0;
        int j = 0;
        while(j < A[0].length){
            int sum = 0;
            while( i < A.length){
                sum += A[i][j];
                i++;
            }
            ans[j] = sum;
            j++;
            i=0;
        }
        return ans;
    }
}

package geekforgeek.easy.array.scaler;

public class MatrixTranspose {
    public int[][] solve(int[][] A) {
        int bRow = A[0].length ; // 3
        int bCol = A.length; // 3
        int[][] ans = new int[bRow][bCol];
        int i = 0;
        int ansRow = 0;
        int ansCol = 0;
        for(int col = 0; col < A[0].length; col++ ){
            while(i < A.length){
                ans[ansRow][ansCol] = A[i][col];
                i++;
                ansCol++;
            }
            ansRow++;
            ansCol = 0;
            i = 0;
        }
        return ans;
    }
}

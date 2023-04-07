package geekforgeek.easy.array.scaler;

public class SpiralMatrix {

    public int[][] generateMatrix(int A) {
        int[][] ans = new int[A][A];

        int N = A;
        int i = 0; int j = 0;
        int count = 1;
        while(i < A && j >= 0 & N > 1){


            // Left to Right
            for(int k = 0; k < N - 1; k++){
                ans[i][j] = count;
                count++;
                j++;
            }

            // Right to Down
            for(int k = 0; k < N - 1; k++){
                ans[i][j] = count;
                count++;
                i++;
            }

            // Right to left
            for(int k = 0; k < N - 1; k++){
                ans[i][j] = count;
                count++;
                j--;
            }
            // Down to Up
            for(int k = 0; k < N - 1; k++){
                ans[i][j] = count;
                count++;
                i--;
            }
            i++;
            j++;
            N -= 2;
        }
        if(N== 1) ans[i][j] = count;
        return ans;
    }
}

package geekforgeek.easy.array.scaler;

public class CountOfEvenNumbersInArray {
    public int[] solve(int[] A, int[][] B) {
        //[ 6, 3, 3, 6, 7, 8, 7, 3, 7 ]
        int[] result = new int[B.length];
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                A[i] = 1;
            }else{
                A[i] = 0;
            }
        }
        //[ 1, 0, 0, 1, 0, 1, 0, 0, 0 ]

        for(int i = 1; i < A.length; i++){
            A[i] = A[i - 1] + A[i];
        }
        //[ 1,1, 1, 2, 2, 3, 3, 3, 3 ]

        for(int i = 0; i < B.length; i++){
            int left = B[i][0];
            int right = B[i][1];
            if(left == 0){
                result[i] = A[right];
            }
            else{
                result[i] = A[right] - A[left - 1];
            }
        }
        return result;
    }
}

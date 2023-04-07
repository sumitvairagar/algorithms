package geekforgeek.easy.array.scaler;

public class SecondLargestNumber {
    public int solve(int[] A) {
        int secondMax = -1;
        int max = A[0];
        for(int i = 1; i < A.length; i++){
            if(max < A[i]){
                max = A[i];
            }
        }

        for(int i = 1; i < A.length; i++){
            if(secondMax < A[i] && A[i] != max){
                secondMax = A[i];
            }
        }

        return secondMax;
    }
}


package scaler.intermediate.bitmanipulation;

import java.util.Arrays;

public class SubArrayWithBitwise {
    public long solve(int A, int[] B) {
        int totalSubArrayWithZero = 0;
        for(int i = 0; i < A; i++){
            int sum = 0;
            for(int j = i; j < A; j++){
                System.out.print(B[j]);
                sum += B[j];
            }System.out.println();
            System.out.println("Sum =" + sum);
            if(sum == 0) totalSubArrayWithZero++;
        }
        int totalSubArrays =(A *(A + 1)) / 2;

        return totalSubArrays - totalSubArrayWithZero;
    }
}

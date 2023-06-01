package scaler.sorting;

import java.util.Arrays;

public class NobleInteger {

        public int solve(int[] A) {

            int N = A.length ;
            Arrays.sort(A);

            for(int i = 0; i < A.length; i++){

                while(i+1<N && A[i]==A[i+1])
                    i++;
                if(N - 1 - i== A[i]) {
                    return 1;
                }
            }
            return -1;
        }


}

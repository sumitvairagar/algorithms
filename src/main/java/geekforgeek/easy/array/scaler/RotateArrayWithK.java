package geekforgeek.easy.array.scaler;

public class RotateArrayWithK {

        public void reverse(int[] A, int start, int end){
            int i = start;
            int j = end;
            while(i < j){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }

        public int[] solve(int[] A, int B) {
            //[ 7, 4, 2, 10, 5 ]
            int k = B % A.length;
            reverse(A, 0, A.length - 1);
            //[ 5, 10, 2, 4, 7 ]
            reverse(A, 0, k - 1);
            reverse(A, k, A.length - 1);
            return A;

        }

}

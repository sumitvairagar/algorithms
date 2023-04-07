package geekforgeek.easy.array.scaler;

public class SpecialIndex {
    public int solve(int[] A) {
        int n = A.length;
        if (n == 1) {
            return 1;
        }

        if (n == 2)
            return 0;

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sumEven += A[i];
            }
            else {
                sumOdd += A[i];
            }
        }

        int currOdd = 0;
        int currEven = A[0];
        int res = 0;
        int newEvenSum = 0;
        int newOddSum = 0;

        for (int i = 1; i < n - 1; i++) {
            if (i % 2 == 1) {
                currOdd += A[i];
                newEvenSum = currEven + sumOdd
                        - currOdd;
                newOddSum = currOdd + sumEven
                        - currEven - A[i];
            }
            else {
                currEven += A[i];
                newOddSum = currOdd + sumEven
                        - currEven;
                newEvenSum = currEven + sumOdd
                        - currOdd - A[i];
            }
            if (newEvenSum == newOddSum) {
                res++;
            }
        }
        if (sumOdd == sumEven - A[0]) {
            res++;
        }
        if (n % 2 == 1) {
            if (sumOdd == sumEven - A[n - 1]) {
                res++;
            }
        }
        else {
            if (sumEven == sumOdd - A[n - 1]) {
                res++;
            }
        }
        return res;
    }
}

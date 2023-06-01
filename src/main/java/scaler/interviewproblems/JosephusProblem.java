package scaler.interviewproblems;

public class JosephusProblem {
    public int msbPos(int n){
        int pos = 0;
        while (n != 0) {
            pos++;
            n = n / 2;
        }
        return pos;
    }
    public int solve(int A) {
        int position = msbPos(A);
        int j = (int)Math.pow(2, (position - 1));
        A = A - j;
        A = A * 2;
        A = A + 1;
        return A;
    }
}

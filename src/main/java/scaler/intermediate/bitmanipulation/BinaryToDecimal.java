package scaler.intermediate.bitmanipulation;

public class BinaryToDecimal {
    public int solve(int A, int B) {
        int ans = 0;
        for(int i = 0; A > 0; i++){
            int curr = A % 10;
            ans += Math.pow(B, i);
            A = A / 10;
        }
        return ans;
    }
}

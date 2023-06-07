package scaler.intermediate.bitmanipulation;

public class DecimalToPowerOfAnyBase {

    public int decimalToAnyBase(int A, int B) {
        int ans = 0;
        int pow = 1;
        while(A > 0){
            int digit = A%B;
            A /= B;
            ans += digit*pow;
            pow *= 10;
        }
        return ans;
    }
}

package scaler.array;

public class WaterTrap {
    public int trap(final int[] A) {
        //{0,1,0,2,1,0,1,3,2,1,2,1};
        int N = A.length;
        int l = 0;
        int r = N - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int ans = 0;

        while(l <= r){  
            if(A[l] <= A[r]){
                if(A[l] > maxLeft){
                    maxLeft = A[l];
                }else{
                    ans += maxLeft - A[l];
                }
                l++;
            }else {
                if(A[r] > maxRight){
                    maxRight = A[r];
                }else{
                    ans += maxRight - A[r];
                }
                r--;
            }
        }
        return ans;
    }
}

package geekforgeek.easy.array.scaler;

public class ProductArray {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        pref[0] = A[0];
        for(int i = 1 ; i < n ; i++){
            pref[i] = pref[i - 1] * A[i];
        }
        suff[n - 1] = A[n - 1];
        for(int i = n - 2 ; i >= 0 ; i--){
            suff[i] = suff[i + 1] * A[i];
        }
        int[] ans = new int[n];
        for(int i = 0 ; i    < n ; i++){
            if(i == 0){
                ans[i] = suff[i + 1];
            }
            else if(i == n - 1){
                ans[i] = pref[i - 1];
            }
            else{
                ans[i] = pref[i - 1] * suff[i + 1];
            }
        }
        return ans;
    }
}

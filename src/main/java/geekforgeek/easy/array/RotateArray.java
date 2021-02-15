package geekforgeek.easy.array;

public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        int[] resultArray = new int[nums.length];
        for(int i = k; i < nums.length; i++){
            resultArray[i] = nums[i - k];
        }

        for(int i = 0 ;  i < k; i++){
            resultArray[i] = nums[nums.length - k + i];
        }
        return resultArray;
    }
}

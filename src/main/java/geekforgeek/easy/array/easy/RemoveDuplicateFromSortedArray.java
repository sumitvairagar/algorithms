package geekforgeek.easy.array.easy;

public class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        //{4, 3, 3, 2, 1};
       int k = 0;

       for(int i = 1; i < nums.length; i++){
           if(nums[i] != nums[i - 1]){
               nums[++k] = nums[i];
           }
       }
       return k + 1;
    }
}

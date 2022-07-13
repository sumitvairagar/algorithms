package geekforgeek.easy.array.easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        int medium = (low + high) / 2;
        while (low <= high){
             medium = (low + high) / 2;

            if(nums[medium] < target){
                low = medium + 1;
            }else if( nums[medium] > target){
                high = medium - 1;
            }else{
                return medium;
            }
        }

        return low;
    }
}

package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList();

        if(nums.length == 1){
         result.add(nums[0] + "");
         return result;
        }

        int i = 0;
        int j = i + 1;
        while( i < nums.length){
            String tempRange = "";
            if(j < nums.length && nums[i] + 1 == nums[j]){
                i++;
                j++;
                continue;
            }else{
                if(nums[i] == nums[j]){
                    tempRange = ""+nums[i];
                }else{
                    tempRange = nums[i] + "->" + nums[j];
                }
                i++;
                j = i + 1;
                result.add(tempRange);
            }
        }
        return result;
    }
}

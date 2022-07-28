package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if(numRows < 1) return null;
        List<List<Integer>> result = new ArrayList();
        List<Integer> temp = new ArrayList();
        temp.add(1); // Takes care of numsRows = 1;
        result.add(temp);

        for(int i = 1; i < numRows; i++){
            temp = new ArrayList();
            temp.add(1);
            for(int j = 1; j < i; j++){
                List<Integer> previous = result.get(i - 1);
                temp.add(previous.get(j - 1) + previous.get(j));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}

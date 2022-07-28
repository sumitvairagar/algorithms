package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {


    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        for(int i = 1; i <= rowIndex; i++){
            temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1; j < i; j++){
                temp.add(result.get( i - 1).get(j - 1) + result.get( i - 1).get(j));
            }
            temp.add(1);
            result.add(temp);
        }

        return result.get(rowIndex);
    }
}

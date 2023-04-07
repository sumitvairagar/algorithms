package leetcode.easy;

import java.util.*;

public class SumOfPairsInArray {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 2, 1}, new int[] {2, 3, 1, 2}));
    }

        // Do not write code to include libraries, main() function or accept any input from the console.
        // Initialization code is already written and hidden from you. Do not write code for it again.
       static public int[] solve(int[] A, int[] B) {
           Map<Integer, Integer> holdA = new HashMap<>();
            for(int i = 0; i < A.length; i++){
                if(holdA.get(A[i]) != null){
                    Integer totalItems = holdA.get(A[i]) + 1;
                    holdA.put(A[i], totalItems);
                }else{
                    holdA.put(A[i], 1);
                }
            }

            List<Integer> result = new ArrayList();
            for(int i = 0; i < B.length; i++){
                if(holdA.get(B[i]) != null){
                    result.add(B[i]);
                    if(holdA.get(B[i]) > 1)
                        holdA.put(B[i],holdA.get(B[i]) - 1 );
                    else
                        holdA.remove(B[i]);
                }
            }
            int[] returnThis = new int[result.size()];
            for(int i = 0; i < result.size(); i++){
                returnThis[i] = result.get(i);
                System.out.println(returnThis[i]);
            }
            return returnThis;
        }


}

package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    Map<String, Integer> romanToDigits = new HashMap();

    RomanToInteger(){
        romanToDigits.put("I", 1);
        romanToDigits.put("V", 5);
        romanToDigits.put("X", 10);
        romanToDigits.put("L", 50);
        romanToDigits.put("C", 100);
        romanToDigits.put("D", 500);
        romanToDigits.put("M", 1000);
    }

    public int romanToInt(String s) {
        String[] letters = s.split("");
        int sum = 0;
        for( int i = 0; i < letters.length; i++){
            if(i + 1 < letters.length && romanToDigits.get(letters[i]) < romanToDigits.get(letters[i + 1])){
                sum -= romanToDigits.get(letters[i]);
            }else{
                sum += romanToDigits.get(letters[i]);
            }
        }
        return sum;
    }
}

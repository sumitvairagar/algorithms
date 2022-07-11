package leetcode.easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for( String c: s.split(""))
        if(c.equals("(") || c.equals("{") || c.equals("[")){
            stack.push(c);
        }else{
            if(stack.isEmpty()) return false;
            stack.pop();
        }
        return stack.isEmpty();
    }
}

package leetcode.easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for( String c: s.split("")){
            if(c.equals(")") && !stack.isEmpty() &&  stack.peek().equals("(")){
                stack.pop();
            }
            else if(c.equals("]") && !stack.isEmpty() && stack.peek().equals("[") ){
                stack.pop();
            }
            else if(c.equals("}") && !stack.isEmpty()  && stack.peek().equals("{")){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

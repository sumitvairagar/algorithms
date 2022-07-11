package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    public void shouldReturnTrueWhenValid(){
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertEquals(true, validParentheses.isValid("{{[]}}"));
    }

    @Test
    public void shouldReturnFalseWhenInvalid(){
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertEquals(false, validParentheses.isValid("{{[]}})"));
    }

    @Test
    public void shouldReturnTrueWhenSecondValid(){
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertEquals(true, validParentheses.isValid("[](){}"));
    }

}
package util;

public class StringUtils {
    public static String reverse(String s) {
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse = reverse +s.charAt(i);
        }
        return reverse;
    }
}

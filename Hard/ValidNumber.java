import java.util.*;
//65. Valid Numbers

public class ValidNumber {
    public static boolean isNumber(String s) {
        s = s.trim();  
        
        boolean hasNum = false; 
        boolean hasDot = false;  
        boolean hasExp = false; 
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                hasNum = true;
            } else if (c == '.') {
                if (hasDot || hasExp) { 
                    return false; 
                }
                hasDot = true;
            } else if (c == 'e' || c == 'E') {
                if (hasExp || !hasNum) { 
                    return false;  
                }
                hasExp = true;
                hasNum = false; 
            } else if (c == '+' || c == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;  
                }
            } else {
                return false;  
            }
        }
        
        return hasNum; 
    }
    public static void main(String[] args) {
        
    }
}
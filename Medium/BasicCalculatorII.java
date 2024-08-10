//227.BasicCalculatorII
import java.util.*;
public class BasicCalculatorII {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }
            
            if (!Character.isDigit(currentChar) && currentChar != ' ' || i == s.length() - 1) {
                if (operation == '+') {
                    stack.push(currentNumber);
                } else if (operation == '-') {
                    stack.push(-currentNumber);
                } else if (operation == '*') {
                    stack.push(stack.pop() * currentNumber);
                } else if (operation == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                
                operation = currentChar;
                currentNumber = 0;
            }
        }
        
        int result = 0;
        for (int num : stack) {
            result += num;
        }
        
        return result;
    }
    public static void main(String[] args) {
        String s = "3+3*2";
        int ans = calculate(s);
        System.out.println(ans);
    }
}

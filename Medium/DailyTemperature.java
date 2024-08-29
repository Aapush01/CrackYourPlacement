// 739. Daily Temperatures 
import java.util.*;

public class DailyTemperature {
    public static int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        Stack<Integer> stk = new Stack<>();
        
        for (int i = T.length - 1; i >= 0; i--) {
            // Pop all values less than or equal to the current value
            while (!stk.isEmpty() && T[stk.peek()] <= T[i]) {
                stk.pop();
            }
            ans[i] = stk.isEmpty() ? 0 : stk.peek() - i;
            stk.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] temp = {76, 77, 78, 70, 67, 65, 75, 78, 80};
        int[] Ans = dailyTemperatures(temp);

        for(int i = 0; i < Ans.length; i++) {
            System.out.print(Ans[i] + " ");
        }
         

    }
}
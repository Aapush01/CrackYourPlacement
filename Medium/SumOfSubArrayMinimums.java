// 907. Sum of Subarray Minimums

import java.util.*;

public class SumOfSubArrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007;
        int n = arr.length;
    
        int[] left = new int[n];
        int[] right = new int[n];
        
        Stack<int[]> stack = new Stack<>();
    
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (!stack.isEmpty() && stack.peek()[0] > arr[i]) {
                count += stack.pop()[1];
            }
            stack.push(new int[]{arr[i], count});
            left[i] = count;
        }
        
        stack.clear();
     
        for (int i = n - 1; i >= 0; i--) {
            int count = 1;
            while (!stack.isEmpty() && stack.peek()[0] >= arr[i]) {
                count += stack.pop()[1];
            }
            stack.push(new int[]{arr[i], count});
            right[i] = count;
        }
       
        long result = 0;
        for (int i = 0; i < n; i++) {
            result = (result + (long) arr[i] * left[i] * right[i]) % MOD;
        }
        
        return (int) result;
    }
    public static void main(String[] args) {

    }
}
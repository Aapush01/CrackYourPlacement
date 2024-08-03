import java.util.*;

public class PermutationsInArray {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int n = arr1.length;
        
        for (int i = 0; i < n; i++) {
            if (arr1[i] + arr2[n - 1 - i] < k) return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        PermutationsInArray permutationsInArray = new PermutationsInArray();
        int[] a = {2, 1, 3};
        int[] b = {7, 8, 9};
        int k = 10;
        System.out.println(permutationsInArray.isPossible(k, a, b));
    }
}

;

public class productArrayPuzzle {
    public static long[] productExceptSelf(int nums[], int n) {
        // brute force
        // long[] ans = new long[n];

        // for(int i = 0; i < n; i++){
        // long pr = 1;
        // for(int j = 0; j < n; j++) {
        // if(i == j) continue;
        // pr *= nums[j];
        // }
        // System.out.print(pr + " ");
        // ans[i] = pr;
        // }
        // return ans;

        // optimize code
        long[] lpr = new long[n];
        long[] rpr = new long[n];
        long[] result = new long[n];

        // calculate left Produts;

        lpr[0] = 1;
        for (int i = 1; i < n; i++) {
            lpr[i] = lpr[i - 1] * nums[i - 1];
        }

        // calculate right products

        rpr[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rpr[i] = rpr[i + 1] * nums[i + 1];
        }

        // calculate the results

        for (int i = 0; i < n; i++) {
            result[i] = lpr[i] * rpr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 3, 5, 6, 2 };
        int n = nums.length;
        productExceptSelf(nums, n);

    }
}
 ;

public class productArrayPuzzle {
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
        //brute force
       long[] ans = new long[n];

       for(int i = 0; i < n; i++){
            long pr = 1;
           for(int j = 0; j < n; j++) {
               if(i == j) continue;
               pr *= nums[j];
           }
           System.out.print(pr + " ");
           ans[i] = pr;
       }
       return ans;
	} 
    public static void main(String[] args) {
        int[] nums = {10,3,5,6,2};
        int n = nums.length;
        productExceptSelf(nums, n);
        
        
    }
}
class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        if(n < 3) return 0;
        int ans = Integer.MIN_VALUE;
        int tempAns = Integer.MIN_VALUE;
        Arrays.sort(nums);
       if(nums[0]<0 && nums[1]<0){
        tempAns = nums[0]*nums[1]*nums[n-1];

       }
       ans = nums[n-1]*nums[n-2]*nums[n-3];
       return Math.max(ans, tempAns);

    }
}

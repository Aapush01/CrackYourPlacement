class Solution {
    public int findDuplicate(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        if(nums[n-1] == nums[n-2]) return nums[n-1];
        while( i < n-1) {
            if(nums[i] == nums[i+1]) return nums[i];
            i++;

        }
        return 0;
    
    }
}

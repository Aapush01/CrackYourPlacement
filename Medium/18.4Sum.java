class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 3; i++) {
            // Avoid duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;  
            for (int j = i + 1; j < nums.length - 2; j++) {
                 // Avoid duplicates for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; 
                
                int left = j + 1;
                int right = nums.length - 1;
                
                while (left < right) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        // Avoid duplicates for left
                        while (left < right && nums[left] == nums[left - 1]) left++;  
                        // Avoid duplicates for right
                        while (left < right && nums[right] == nums[right + 1]) right--;  
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return result;
    }
}
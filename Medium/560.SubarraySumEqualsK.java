class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        
        int prefixSum = 0;
        int count = 0;
        prefixSumCount.put(0, 1);
        
        for (int num : nums) { 
            prefixSum += num;
            if (prefixSumCount.containsKey(prefixSum - k)) {
                count += prefixSumCount.get(prefixSum - k);
            }
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
     
    }
}
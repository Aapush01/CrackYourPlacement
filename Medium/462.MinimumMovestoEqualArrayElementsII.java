class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        // Find the median
        Arrays.sort(nums);
        int k = nums[n / 2];

        // Calculate the number of moves
        int moves = 0;
        for (int num : nums) {
            moves += Math.abs(num - k);
        }
        return moves;

    }
}
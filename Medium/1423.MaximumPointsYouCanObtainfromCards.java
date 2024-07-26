class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += cardPoints[i];
        }
        if (k == n) {
            return totalSum;
        }

        int minSubarraySum = 0;

        for (int i = 0; i < n - k; i++) {
            minSubarraySum += cardPoints[i];
        }

        int currentSubarraySum = minSubarraySum;
        for (int i = n - k; i < n; i++) {
            currentSubarraySum += cardPoints[i] - cardPoints[i - (n - k)];
            minSubarraySum = Math.min(minSubarraySum, currentSubarraySum);
        }

        return totalSum - minSubarraySum;

    }
}
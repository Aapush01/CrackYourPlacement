class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        //Find a candidate for the majority element using the Boyer-Moore Voting Algorithm
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        //Verify that the candidate is actually the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found");
        }

    }
}

class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
       Arrays.sort(arr);  // Sort the array
        
        int i = 0;
        int j = 1;
        
        while (i < n && j < n) {
            int diff = arr[j] - arr[i];
            
            if (i != j && diff == x) {
                return 1;  // Pair found
            } else if (diff < x) {
                j++;
            } else {
                i++;
            }
        }
        
        return -1;  // No pair found
        
    }
}

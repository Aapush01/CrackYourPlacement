
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int n)
    {
        // Your code here
        int sm = 1;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i] == sm) sm++;
        }
        return sm;
    }
}
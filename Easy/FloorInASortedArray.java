class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int m = n-1;
       while(m>0){
           if(arr[m] == x || arr[m] < x){
               return m;
           }else{
               m--;
           }
       }
       return -1;
    }
    
}
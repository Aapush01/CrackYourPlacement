class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        long min  = Integer.MAX_VALUE;
        Collections.sort(a);
        int i = 0;
        int j = m-1;
        while(j<n) {
            long diff = a.get(j) - a.get(i);
            min = Math.min(min, diff);
            i++;
            j++;
             
        }
        return min;
    }
}
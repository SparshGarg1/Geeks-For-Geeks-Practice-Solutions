class Solution {
    public static int search(int n, int k, int[] arr) 
    {
        // code here
        int i=-1;
        for(int j=0; j<n; j++)
        {
            if(arr[j]==k) return j+1;
        }
        return i;
    }
}
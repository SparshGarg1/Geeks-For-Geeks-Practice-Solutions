class Solution 
{
    int print2largest(int arr[], int n) 
    {
        //finding largest element
        int max=arr[0];
        for(int i=1; i<n; i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        //finding second largest element
        int max2 = -1;
        for(int i=1; i<n; i++)
        {
            if(max2<arr[i] && arr[i]!=max)
            {
                max2 = arr[i];
            }
        }
        return max2;
    }
}
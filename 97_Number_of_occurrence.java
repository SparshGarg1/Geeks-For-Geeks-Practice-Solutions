class Solution {
     public int findFirst(int[] nums, int target)
    {
        int s=0, e=nums.length-1;
        int indx=-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(target==nums[mid])
            {
                indx=mid;
                e=mid-1;
            }
            else if(target<nums[mid])
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return indx;
    }
    public int findLast(int[] nums, int target)
    {
        int s=0, e=nums.length-1;
        int indx=-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(target==nums[mid])
            {
                indx=mid;
                s=mid+1;
            }
            else if(target<nums[mid])
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return indx;
    }
    int count(int[] arr, int n, int x) 
    {
        // code here
        if(findLast(arr,x)==-1 && findFirst(arr,x)==-1) return 0;
        return findLast(arr,x)-findFirst(arr,x)+1;
    }
}
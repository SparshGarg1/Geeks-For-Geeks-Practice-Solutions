class Solution 
{
    void immediateSmaller(int nums[], int n) 
    {
        // code here
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]>nums[i+1])
            {
                nums[i]=nums[i+1];
            }
            else
            {
                nums[i]=-1;
            }
        }
        nums[n-1]=-1;
    }
}
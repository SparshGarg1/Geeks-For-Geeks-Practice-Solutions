class Solution{
    public int countOfElements(int []arr,int n,int x)
    {
        // code here
        int i=0;
        for(int j : arr)
        {
            if(j<=x) i++;
        }
        return i;
    }
}
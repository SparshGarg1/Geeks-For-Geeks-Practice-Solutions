class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) 
    {
        // code here
        
        int j=0;
        int j1=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]<=x) j++;
            if(arr[i]>=x) j1++;
            
        }
        return new int[]{j,j1};
    }
}
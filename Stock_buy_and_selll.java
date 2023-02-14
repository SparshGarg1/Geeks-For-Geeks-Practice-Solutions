class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) 
    {
        
        ArrayList<ArrayList<Integer>>  ans = new ArrayList<ArrayList<Integer>>(); 
        ArrayList<Integer> al = null;
        for(int i=0; i<n-1;i++)
        {
            
            if(A[i+1]>A[i])
            {
                al = new ArrayList<>();
                al.add(i);
                al.add(i+1);
                ans.add(al);
            }
            
        }
        return ans;
    }
}

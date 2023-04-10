class Solution{
    static ArrayList<Long> factorialNumbers(long N)
    {
        // code here
        ArrayList<Long> al = new ArrayList<>();
        long f=1;
        for(long i=1; i<=N; i++)
        {
            f=f*i;
            if(f<=N) al.add(f);
            
            else return al;
        }
        return al;
    }
}
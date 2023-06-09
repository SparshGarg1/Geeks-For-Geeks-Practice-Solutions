class Solution{
    static long sumOfDivisors(int N)
    {
        // code here
        long sum=0;
        for(long i=1; i<=N; i++)
        {
            sum+=i*(N/i);
        }
        return sum;
    }
}
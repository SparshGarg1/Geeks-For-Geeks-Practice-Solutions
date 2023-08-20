class Solution
{
    static int isPrime(int N)
    {
        if(N==0 || N==1) return 0;
        int flag=0;
        for(int i=2; i<=Math.sqrt(N); i++)
        {
            if(N%i==0) flag++;
        }
        if(flag>0) return 0;
        
        return 1;
    }
}
class Solution{
    static long factorial(int n)
    {
        // code here
        if(n==1 || n==0) return 1;
        return n * factorial(n-1);
    }
}
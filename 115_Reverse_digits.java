class Solution
{
    public long reverse_digit(long n1)
    {
        // Code here
        long rev_num=0;
        while(n1!=0)
        {
            rev_num=rev_num*10 + n1%10;
            n1=n1/10;
        }
        return rev_num;
    }
}
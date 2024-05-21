class Solution
{
    public String is_palindrome(int n)
    {
        // Code her
        int rev_num=0;
        int n1=n;
        while(n1!=0)
        {
            rev_num=rev_num*10 + n1%10;
            n1=n1/10;
        }
        if(rev_num==n) return "Yes";
        else return "No";
    }
}
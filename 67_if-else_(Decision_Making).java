class Solution{
    static String compareNM(int n,int m)
    {
        // code here
        if(n==m)
        {
            return "equal";
        }
        else if(n<m)
        {
            return "lesser";
        }
        else
        {
            return "greater";
        }
    }
}
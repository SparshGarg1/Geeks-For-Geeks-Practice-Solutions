class Solution 
{
    
    static String armstrongNumber(int n)
    {
        // code here
        if((Math.pow(n%10,3)+Math.pow((n/10)%10,3)+Math.pow((n/100)%10,3))==n) return "Yes";
        return "No";
    }
}
class Solution
{
    //Function to check if the number is sparse or not.
    public static boolean isSparse(int n)
    {
        // Your code here
        String n1 = Integer.toBinaryString(n);
        for(int i=0; i<n1.length()-1; i++)
        {
            if(n1.charAt(i)=='1' && n1.charAt(i+1)=='1') 
            return false;
        }
        return true;
    }
}
class Solution
{
    static int evenlyDivides(int N)
    {
        // code here
        int i=0;
        int num =N;
        while (num > 0) 
        {
            if((num%10)!=0 && N%(num % 10)==0) i++;
            num = num / 10;
            
        }
        return i;
    }
}
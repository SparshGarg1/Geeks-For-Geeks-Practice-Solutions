class Solution{
    static int setKthBit(int N,int K)
    {
        // code here
        String s = Integer.toBinaryString(N);
        char arr[] = s.toCharArray();
        for(int i=0; i<arr.length; i++)
        if(arr[arr.length-K-1]=='0')
        {
            arr[arr.length-K-1]='1';
        }
        
        String s1 = new String(arr);
        int decimal=Integer.parseInt(s1,2);
        return decimal;
    }
}
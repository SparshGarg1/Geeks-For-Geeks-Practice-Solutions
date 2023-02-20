class Solution {
    static int toggleBits(int N , int L , int R) {
        // code here
        String s = Integer.toBinaryString(N);
        char arr[] = s.toCharArray();
        int l= arr.length;
        for(int i=l-R; i<=l-L; i++)
        {
            if(arr[i]=='0')
            arr[i]='1';
            
            else
            arr[i]='0';
        }
        String s1 = new String(arr);
        int i = Integer.parseInt(s1,2);
        return i;
    }
};
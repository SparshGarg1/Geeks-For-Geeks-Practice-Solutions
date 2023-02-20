class Solution {
    static int countSquares(int N) {
        // code here
        int temp=0;
        for(int i=1; i*i<N; i++)
        {
            temp++;
        }
        return temp;
    }
}
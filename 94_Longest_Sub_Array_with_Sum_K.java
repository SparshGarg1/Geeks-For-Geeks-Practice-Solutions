class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0; i<N; i++)
        {
            sum+=A[i];
            //initially(Base Condition)
            if(sum==K) maxLen=Math.max(maxLen,i+1);
            
            int rem = sum-K;
            if(preSumMap.containsKey(rem)) maxLen=Math.max(maxLen,i-preSumMap.get(rem));
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
    
    
}


class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x)
    {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(arr[0],0);
        for(int i=1; i<n; i++)
        {
            if(map.containsKey(x-arr[i]))
            {
               return true;
            }
            else
            {
                map.put(arr[i],0);
            }
        }
        return false;
    }
}
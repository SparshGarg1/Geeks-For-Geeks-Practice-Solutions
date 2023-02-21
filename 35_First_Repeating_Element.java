class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) 
    {
        // Your code here
        if(n==1) return -1;
        int r=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
            
            for(int i=0; i<n; i++)
            {
                if(map.get(arr[i])>1)
                return i+1;
            }
            return -1;
    }
}
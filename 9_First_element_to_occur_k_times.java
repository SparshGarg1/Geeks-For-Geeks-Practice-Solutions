class Solution
{
    public int firstElementKTime(int[] a, int n, int k) 
    { 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int it : a)
        {
            if(map.containsKey(it))
            {
                map.put(it,map.get(it)+1);
            }
            else
            {
                map.put(it, 1);
            }
            if(map.get(it)==k)
                {
                    return it;
                }
        }
        return -1;
    } 
}
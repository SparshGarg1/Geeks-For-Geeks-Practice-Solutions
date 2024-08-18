class Pair
{
    private int key;
    private int value;
    Pair(int key, int value)
    {
        this.key=key;
        this.value=value;
    }
    public int getKey(){return key;}
    public int getValue(){return value;}
}
class Solution {
    // Function to sort the array according to frequency of elements.

    public ArrayList<Integer> sortByFreq(int arr[])
    {
        // add your code here
        //key->number, value->ouccurence
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Pair> pairs = new ArrayList<>();
        for(int i : map.keySet())
        {
            pairs.add(new Pair(i,map.get(i)));
        }
        //For sorting number in increasing order
        Collections.sort(pairs,(l1,l2)->Integer.compare(l1.getKey(),l2.getKey()));
        
        //For sorting according to the frequency
        Collections.sort(pairs,(l2,l1)->Integer.compare(l1.getValue(),l2.getValue()));
         
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(Pair p : pairs)
        {
            
            for(int i=0; i<p.getValue(); i++)
            {
                ans.add(p.getKey());
            }
        }
        return ans;
    }
}

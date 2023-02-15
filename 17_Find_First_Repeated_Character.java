class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        char arr[] = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
                return ""+arr[i];
            }
            else
            map.put(arr[i], 1);
        }
        return "-1";
    }
} 
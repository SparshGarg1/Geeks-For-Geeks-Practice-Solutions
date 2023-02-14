class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        //ArrayList<Integer> al = new ArrayList<Integer>(); if there will be for suppose 3 duplicate element then it wwill that element 2 times that will create a problem
        TreeSet<Integer> al = new TreeSet<>(); //sorted as well as unique
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++)
        {
            if(arr[i]==arr[i+1])
            al.add(arr[i]);
        }
        ArrayList<Integer> al1 = new ArrayList<>(al);
        
        if(al1.isEmpty())
        al1.add(-1);
        return al1;
    }
}

//using HashMap
/* 
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
       HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
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
         for(int key:map.keySet())

            {

                if(map.get(key)>1)

                al.add(key);

            }
            if(al.isEmpty())
            al.add(-1);
            
            Collections.sort(al);


            return al;
        
    }
}
*/
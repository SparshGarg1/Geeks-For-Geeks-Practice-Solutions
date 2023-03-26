class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
       
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i : arr1)
        {
            ts.add(i);
        }
        for(int i : arr2)
        {
            ts.add(i);
        }
        ArrayList<Integer> al = new ArrayList<>(ts);
        return al;
    }
}
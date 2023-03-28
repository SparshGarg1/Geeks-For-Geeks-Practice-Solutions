class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int a[], int n)
    {
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--)
        {
            if(a[i]>=max)
            {
                max=a[i];
                al.add(max);
            }
        }
        Collections.reverse(al);
        return al;
    }
}

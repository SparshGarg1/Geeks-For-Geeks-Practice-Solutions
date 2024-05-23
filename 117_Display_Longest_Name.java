class Solution 
{
    public static String longest(int n, String[] names) 
    {
        // code here
        int l=0;
        int index=-1;
        for(int i=0; i<names.length; i++)
        {
            if(names[i].length()>l)
            {
                l=names[i].length();
                index=i;
            }
        }
        return names[index];
    }
}
        
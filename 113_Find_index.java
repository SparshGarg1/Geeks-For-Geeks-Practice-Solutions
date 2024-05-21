class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int arr[], int n, int key) 
    { 
        //from begining 
        int b=-1, e=-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==key)
            {
                b=i;
                break;
            }
        }
        
        //from end 
 
        for(int i=arr.length-1; i>=0; i--)
        {
            if(arr[i]==key)
            {
                e=i;
                break;
            }
        }
        
        return new int[]{b,e};
    }
}
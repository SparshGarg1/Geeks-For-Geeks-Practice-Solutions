class GfG
{
    void printPat(int n)
    {
         // Your code here
         for(int i=n; i>=1; i--)
         {
                 for(int j = n ; j >= 1 ; j--)
             {
                    for(int k=i; k>=1; k--)
                    {
                        System.out.print(j+" ");
                    }
             }
             System.out.print('$');
         }
    }
}
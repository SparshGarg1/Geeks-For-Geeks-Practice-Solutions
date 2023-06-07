class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       Node current = node;
       int i=1;
       while(current!=null)
       {
           if(ind==i) return current.data;
           current = current.next;
           i++;
       }
       return -1;
    }
}
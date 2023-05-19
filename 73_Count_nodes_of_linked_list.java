class Solution
{
    //Function to count nodes of a linked list.
    public static int length(Node head)
    {
        if(head==null) return 0;
        int count =0;
        Node current = head;
        while(current.next!=null)
        {
            count++;
            
            current = current.next;
            
        }
        return count;
    }
    public static int getCount(Node head)
    {
        
        //Code here
        return length(head)+1;
    }
}
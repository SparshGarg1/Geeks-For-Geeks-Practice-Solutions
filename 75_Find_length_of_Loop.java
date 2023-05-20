class Solution
{
    //Function to find the length of a loop in the linked list.
     public static Node startNodeCycle(Node head) 
    {
        Node fastPtr = head;
        Node slowPtr = head;
        while(fastPtr != null && fastPtr.next != null)
        {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr==fastPtr) 
                return getStartNode(slowPtr,head);
        }
        return null;
    }
    public static Node getStartNode(Node slowPtr,Node head)
    {
        Node temp =head;
        while(temp!=slowPtr)
        {
            slowPtr=slowPtr.next;
            temp=temp.next;
        }
        return temp;
    }
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node slowPtr = startNodeCycle(head);
        if(slowPtr==null) return 0;
        Node temp = slowPtr.next;
        int count =0;
        while(temp!=slowPtr)
        {
            
            count ++;
            temp=temp.next;
        }
        return count+1;
    }
}
class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public int length(Node head)
    {
        Node current = head;
        int l=0;
        while(current!=null)
        {
            l++;
            current=current.next;
        }
        return l;
    }
    public boolean isIdentical (Node head1, Node head2)
    {
        //write your code here 
        if(length(head1)!=length(head2)) return false;
        Node current1 = head1;
        Node current2 = head2;
        while(current1!=null)
        {
            if(current1.data!=current2.data) return false;
            current1=current1.next;
            current2=current2.next;
        }
        return true;
    }
}
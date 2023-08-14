class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        //code here
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return getStartNode(slow,head);
        }
        return -1;
    }
    public static int getStartNode(Node slowPtr,Node head)
    {
        Node temp =head;
        while(temp!=slowPtr)
        {
            slowPtr=slowPtr.next;
            temp=temp.next;
        }
        return temp.data;
    }
}
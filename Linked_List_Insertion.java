class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node newnode = new Node(x);
        if(head==null){
        return newnode;
        }
        newnode.next=head;
        head= newnode;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node newnode = new Node(x);
        if(head==null) return newnode;
        
        Node current = head;
        while(current.next!=null)
        {
            current = current.next;
        }
        current.next=newnode;
        return head;
    }
}
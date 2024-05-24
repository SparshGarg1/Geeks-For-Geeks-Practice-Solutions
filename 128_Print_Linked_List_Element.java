class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        //add code here
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
}
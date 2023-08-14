class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node fastPtr = head;
         Node slowPtr = head;
         while(fastPtr != null && fastPtr.next != null){
             slowPtr = slowPtr.next;
             fastPtr = fastPtr.next.next;
         }
         return slowPtr.data;
    }
}
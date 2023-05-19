class Solution {
    static Node constructLL(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i=1; i<arr.length; i++)
        {
            Node newnode = new Node(arr[i]);
            current.next=newnode;
            current = current.next;
        }
        return head;
    }
    
}
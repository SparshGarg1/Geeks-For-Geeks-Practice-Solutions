class Solution {
    public static boolean search(Node head, int key)
{
    Node current = head;
    
    while(current.next!=null)
    {
        if(current.data == key) return true;
        current = current.next;
    }
    return false;
}
    static boolean searchKey(int n, Node head, int key)
    {
        return search(head, key);
    }
}
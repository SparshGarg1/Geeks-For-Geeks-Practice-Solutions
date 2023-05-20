class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
       ArrayList<Integer> al = new ArrayList<>();
        Node temp = head;
        while(temp!=null)
        {
            al.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(al);
        temp = head;
        for(int i : al)
        {
            temp.data=i;
            temp=temp.next;
        }
        return head;
    }
}

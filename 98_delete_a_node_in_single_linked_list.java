class GfG
{
    Node deleteNode(Node head, int pos)
    {
	// Your code here
	if(pos==1)
		{
			head = head.next;
		}
		else
		{
			Node previous = head;
			int count = 1;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			Node current = previous.next;
			previous.next=current.next;
		
		}
			return head;
    }
}
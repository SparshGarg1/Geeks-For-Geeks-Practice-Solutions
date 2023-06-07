class GfG
{
    
    boolean isCircular(Node head)
    {
        Node slow = head;
        Node fast = head;
        
        if(head == null){
          return true;
        }
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }
        
        return false;
        
    }
}
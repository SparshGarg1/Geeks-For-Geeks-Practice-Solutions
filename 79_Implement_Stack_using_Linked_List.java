class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        // Add your code here
        StackNode newnode = new StackNode(a);
        if(top == null)
        {
            top = newnode;
        }
        else
        {
            newnode.next=top;
        top=newnode;
        }
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        // Add your code here
         if(top == null) return -1;
        int res = top.data;
        StackNode temp = top;
        top=top.next;
        temp.next=null;
        return res;
    }
}
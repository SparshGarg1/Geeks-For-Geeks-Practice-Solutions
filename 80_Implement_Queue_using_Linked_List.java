/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode newnode = new QueueNode(a);
        if(front==null)
        {
            front=newnode;
            rear=newnode;
        }
        else
        {
            rear.next=newnode;
            rear=newnode;
        }
        
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front==null) return -1;
        int res= front.data;
        front=front.next;
        return res;
	}
}

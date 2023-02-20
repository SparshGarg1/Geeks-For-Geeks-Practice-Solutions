class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q)
    {
        //add code here.
        Stack<Integer> st = new Stack<Integer>();
        Queue<Integer> ans = new LinkedList<Integer>();
        for(int i : q)
        {
           st.push(i);
       }
       while(!st.isEmpty())
       {
           ans.add(st.pop());
       }
       return ans;
    }
}
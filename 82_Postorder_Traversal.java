class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    private void traverse(Node root, ArrayList<Integer> al)
    {
        if(root==null) return;
        traverse(root.left,al);
        traverse(root.right,al);
        al.add(root.data);
    }
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> al = new ArrayList<>();
       traverse(root,al);
       return al;
    }
}
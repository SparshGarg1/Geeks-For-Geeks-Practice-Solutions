class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    private static void traverse(Node root, ArrayList<Integer> al)
    {
        if(root==null) return;
        al.add(root.data);
        traverse(root.left, al);
        traverse(root.right,al);
        
    }
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> al = new ArrayList<>();
        traverse(root, al);
        return al;
    }

}
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    private void traverse(Node root, ArrayList<Integer> al)
    {
        if(root==null) return;
        traverse(root.left, al);
        al.add(root.data);
        traverse(root.right,al);
        
    }
    ArrayList<Integer> inOrder(Node root) 
    {
        // Code
        ArrayList<Integer> al = new ArrayList<>();
        traverse(root,al);
        return al;
    }
}
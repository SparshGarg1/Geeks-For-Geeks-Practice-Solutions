class Tree{
    private void getPath(Node root, ArrayList<ArrayList<Integer>> al, ArrayList<Integer> temp)
    {
        temp.add(root.data);
        if(root.left==null && root.right==null)
        {
            al.add(new ArrayList(temp));
            temp.remove(temp.size()-1);
            return;
        }
        if(root.left!=null)
        {
            getPath(root.left,al,temp);
        }
        if(root.right!=null)
        {
            getPath(root.right,al,temp);
        }
             temp.remove(temp.size()-1);
        
    }
    public ArrayList<ArrayList<Integer>> Paths(Node  root)
    {
        // Code here
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        getPath(root,al, new ArrayList());
        return al;
    }
    
}
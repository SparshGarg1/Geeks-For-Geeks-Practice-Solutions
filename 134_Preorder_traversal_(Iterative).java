// Preorder traversal (Iterative)
//https://www.geeksforgeeks.org/problems/preorder-traversal-iterative/1

//Solution:
class Tree {
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
          Node temp = st.pop();
          al.add(temp.data);
          if(temp.right!=null){
              st.push(temp.right);
          } 
          if(temp.left!=null){
              st.push(temp.left);
          }
        }
        return al;
    }
}
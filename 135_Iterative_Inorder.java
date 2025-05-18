//Iterative Inorder
// https://www.geeksforgeeks.org/problems/inorder-traversal-iterative/0

//Solution:
class Solution {
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node temp = root;
        while(!st.isEmpty() || temp!=null){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }else{
                temp = st.pop();
                al.add(temp.data);
                temp=temp.right;
            }
        }
        return al;
    }
}
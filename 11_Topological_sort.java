class Solution
{
    public static void dfs(int node, int vis[], Stack<Integer> st, ArrayList<ArrayList<Integer>> adj)
    {
        vis[node] = 1;
        for(int it : adj.get(node))
        {
            if(vis[it]==0)
            {
                dfs(it,vis,st,adj);
            }
        }
        st.push(node);
    }
    
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int vis[] = new int[V];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<V; i++)
        {
            if(vis[i]==0)
            dfs(i,vis,st,adj);
        }
        
        int result[] = new int[V];
        for(int i=0; i<V; i++)
        {
            result[i] = st.peek();
            st.pop();
        }
        return result;
    }
}

//Note: dfs method is made static, if it is not made static method then object of class will be created for calling dfs method in topoSort static methodwhich will be complicated
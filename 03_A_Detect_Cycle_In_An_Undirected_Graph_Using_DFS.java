class Solution {
    // Function to detect cycle in an undirected graph.
    private boolean dfs(int node, int parent, int vis[], ArrayList<ArrayList<Integer>> adj)
    {
        vis[node]=1;
        for(int adjacentNode : adj.get(node))
        {
            if(vis[adjacentNode]==0)
            {
                if(dfs(adjacentNode, node, vis, adj)==true)
                return true;
            }
            else if(adjacentNode!=parent)
            {
                return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V]; 
        for(int i=0; i<V; i++)
        {
            if(vis[i]==0)
            {
                if(dfs(i,-1,vis,adj)==true) return true;
            }
        }
        return false;
    }
}
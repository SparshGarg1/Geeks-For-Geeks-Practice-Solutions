class Pair
{
    int first, second;
    Pair(int n1, int n2)
    {
        n1 = first;
        n2 = second;
    }
}
class Solution {
    public boolean checkForCycle(int src, int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis)
    {
        vis[src]=1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,-1));
        while(!q.isEmpty())
        {
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();
            for(int i : adj.get(node))
            {
                if(vis[i]==false)
                {
                    q.add(new Pair(i, node));
                    vis[i]=1;
                }
                else if(parent!=i)
                {
                    return true;
                }
            }
            
        }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[]= new boolean[V]; 
        for(int i=0; i<V; i++)
        {
            vis[i]=false;
        }
        for(int i=0; i<V; i++)
        {
            if(vis[i]==false)
            {
                if(checkForCycle(i, V, adj, vis)) return true;
            }
        }
        return false;
    }
}
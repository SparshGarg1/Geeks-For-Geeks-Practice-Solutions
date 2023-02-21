class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static class Pair{
        int first, second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y) -> x.first - y.first);
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        dist[S] = 0;
        pq.add(new Pair(0,S));
        
        while(!pq.isEmpty()){
            Pair src = pq.peek();
            pq.remove();
            int node = src.second;
            int d = src.first;
            
            for(ArrayList<Integer> nbr : adj.get(node)){
                int nbrNode = nbr.get(0);
                int nbrW = nbr.get(1);
                
                if(d+nbrW < dist[nbrNode]){
                    dist[nbrNode] = Math.min(dist[nbrNode], d+nbrW);
                    pq.add(new Pair(d+nbrW, nbrNode));
                }
            }
        }
        
        return dist;
    }
}
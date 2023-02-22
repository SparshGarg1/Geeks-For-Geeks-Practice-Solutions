class Tuple
{
    int first, second, third;
    Tuple(int first, int second, int third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}

class Solution {

    int shortestPath(int[][] grid, int[] source, int[] destination) {

        // Your code here
        if(source[0] == destination[0] && 
           source[1] == destination[1]) return 0; 
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(0,source[0],source[1]));
        
        int dist[][] = new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                dist[i][j] = (int)1e9;
            }
        }
        dist[source[0]][source[1]]=0;
        
        int dr[] = {-1, 0, 1, 0}; 
        int dc[] = {0, 1, 0, -1}; 
        
        while(!q.isEmpty())
        {
            int dis = q.peek().first;
            int r = q.peek().second;
            int c = q.peek().third;
            q.remove();
            for(int i=0; i<4; i++)
            {
                int newr = r + dr[i];
                int newc = c + dc[i];
                
                if(newr>=0 && newc>=0 && newr<grid.length && newc<grid[0].length && grid[newr][newc] == 1  && (dis+1)<dist[newr][newc])
                {
                    dist[newr][newc]=dis+1;
                    if(newr == destination[0] && 
                       newc == destination[1]) return dis + 1; 
                    q.add( new Tuple(dis+1,newr,newc));
                }
            }
        }
        return -1;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        if(grid[0][0]==1)
            return -1;
        if(n==1 && m==1 )
          return 1;
        
        int[][]dist = new int[n][m];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                dist[i][j] = (int)1e9;
            }
        }
        dist[0][0] = 1;
       
        //queue will store dist, coordinate of cell
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(1,0,0));
        while(!q.isEmpty())
        {
            int dis = q.peek().d;
            int row = q.peek().r;
            int col = q.peek().c;
            q.poll();
            for(int i= -1; i<=1; i++)
            {
             for(int j=-1; j<=1; j++)
             {
                int nrow = row +i;
                int ncol = col+j;
            if(nrow >=0 && nrow<n && ncol >=0 && ncol <m && grid[nrow][ncol]==0 && dis +1 <dist[nrow][ncol])
            {
                dist[nrow][ncol] = dis+1;
                if(nrow == n-1 && ncol == m-1)  return dis+1; 
                q.offer(new Pair(dis+1,nrow,ncol));
            }
                }
            }
            
        }
        return -1;
    }
}
class Pair{
    int d;
    int r;
    int c;
    public Pair(int d,int r,int c)
    {
        this.d = d;
        this.r = r;
        this.c = c;
    }
}

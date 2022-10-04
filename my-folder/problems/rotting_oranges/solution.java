class Pair
{
    int first;
    int second;
    int third;
    public Pair(int first, int second, int third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int [][] vis = new int[n][m];
        Queue<Pair> q = new LinkedList<Pair>();
        int time =0;
        int cntfresh =0;
        
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new Pair(i,j,0));
                    vis[i][j] =1;
                }
                if(grid[i][j] == 1)
                    cntfresh++;
            }
        }
        int tm =0;
        int cnt =0;
        while(!q.isEmpty())
        {
            int r = q.peek().first;
            int c = q.peek().second;
            int t = q.peek().third;
            q.poll();
            tm = Math.max(tm,t);
            for(int row=-1;row<=1; row++ )
            {
                for(int col =-1; col<=1; col++)
                {
                    if(row != col && row != -col)
                    {
                        int nrow = row +r;
                        int ncol = col +c;
                        if(nrow >=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol] !=1 && grid[nrow][ncol]==1 )
                        {
                            q.offer(new Pair(nrow,ncol,t+1));
                            vis[nrow][ncol] = 1;
                            cnt++;
                        }
                    }
                }
            }
            
        }
        if(cnt != cntfresh)
            return -1;
        else
            return tm;
        
        
    }
}
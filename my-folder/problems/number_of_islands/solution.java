class Pair
{
    int row;
    int col;
    public Pair(int row,int col)
    {
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int ans =0;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]==0)
                {
                    bfs(i,j,vis,grid,n,m);
                    ans++;   
                }
            }
        }
        return ans;
    }
    public static void bfs(int row, int col,int[][] vis, char[][] grid,int n,int m )
    {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(row,col));
        vis[row][col] =1;
        while(!q.isEmpty())
        {
            int row1 = q.peek().row;
            int col1 = q.peek().col;
            q.poll();
        for(int i=-1; i<=1; i++)
        {
            for(int j=-1; j<=1;j++)
            {
              if(i!=j && i!= -j)
              {
                 int nrow = row1 +i;
                 int ncol = col1 +j;
                 if(nrow >=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1'&& vis[nrow][ncol]==0)
                 {
                     vis[nrow][ncol] =1;
                     q.offer(new Pair(nrow,ncol));
                 }
              }
                
            }
        }
        }
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] vis = new int[n][m];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if( vis[i][j]==0 && grid[i][j]==1)
                {  if(i==0 || i==n-1|| j==0|| j==m-1)
                     dfs(i,j,vis,grid,n,m);
                }
            }
        }
        System.out.println(Arrays.deepToString(vis));
        int count =0;
        for(int r=0; r<n;r++)
        {
            for(int c=0; c<m; c++)
            {
                if(vis[r][c]==0 && grid[r][c]==1)
                    count++;
            }
        }
        return count;
    }
    public static void dfs(int row, int col, int [][] vis,int[][] grid,int n , int m)
    {
        vis[row][col] =1;
        System.out.println("row" + row + " "+"col" + col);
        for(int i=-1; i<=1; i++)
        {
            for(int j=-1; j<=1; j++)
            {
                if(i!= j && i!= -j)
                {
                    int nrow = row+i;
                    int ncol = col+j;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0  && grid[nrow][ncol]==1)
                    {   System.out.println("row:" +row +" "+ "i:" +i);
                        System.out.println("col:" +col +" "+ "j:" +j);
                        dfs(nrow,ncol,vis,grid,n,m);
                    }
                }
            }
        }
    }
}
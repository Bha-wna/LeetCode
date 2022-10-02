class Solution {
    public int numIslands(char[][] grid) {
       int vis[][]  = new int[grid.length][grid[0].length];
        int count =0;
       for(int i=0; i<grid.length; i++)
       {
           for(int j=0; j<grid[0].length; j++)
           {
               if(grid[i][j]=='1' && vis[i][j] !=1)
               {
                   count++;
                   dfs(i, j, vis, grid);
               }
           }
       }
        return count;
    }
    public void dfs(int row, int col, int vis[][],char[][] grid )
    {  
       // Queue<Pair> q = new LinkedList<>();
      //  q.offer(new Pair(row,col));
        vis[row][col] = 1;
        // while(!q.isEmpty())
        // { 
        int n= row;
        int m = col;
       // q.poll();
        for(int i=-1; i<=1; i++)
        {
            for(int j=-1; j<=1; j++)
            {
                if(i != j && i!= -j)
                {
                    int nrow = n+i;
                    int ncol = m+j;
                    if(nrow>=0 && nrow <grid.length && ncol >=0 && ncol< grid[0].length && grid[nrow][ncol] =='1' && vis[nrow][ncol] !=1 )
                    {   vis[nrow][ncol] =1;
                        dfs(nrow,ncol,vis,grid); 
                    }
                }
            }
        }
        
    }
}
class Pair{
    int row;
    int col;
    public Pair(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
}
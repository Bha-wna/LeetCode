class Solution {
    public void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        
        int[][]vis = new int[r][c];
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(board[i][j]=='O' && vis[i][j]==0 && (i ==0 || j==0 || i== r-1 || j==c-1 ))
                {
                    dfs(i,j,vis,board,r,c);
                }
            }
        }
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(board[i][j]=='O' && vis[i][j]!=1)
                {
                    board[i][j]='X';
                }
            }
        }
        
    }
    
    public void dfs(int row, int col,int[][]vis,char[][] board, int r, int c)
    {
        vis[row][col]=1;
       // board[row][col] = '1';
        for(int i=-1; i<=1; i++)
        {
            for(int j=-1; j<=1; j++)
            {
              if(i !=j && i != -j)
              {
                int nrow = row + i;
                int ncol = col + j;
                if(nrow >=0 && nrow <= r-1 && ncol >=0 && ncol <= c-1 && vis[nrow][ncol]==0 && board[nrow][ncol]=='O' )
                {

                    dfs(nrow,ncol,vis,board,r,c);
                }
              }
            }
        }
    }
}
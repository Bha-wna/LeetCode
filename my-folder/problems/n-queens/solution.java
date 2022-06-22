class Solution {
    public List<List<String>> solveNQueens(int n) {
       List<List<String>> ans  = new ArrayList<List<String>>();
       char[][] board = new char[n][n]; 
        
        int[] leftRow = new int[n];
        int [] upperDiagonal = new int[2*n-1];
        int [] lowerDiagonal = new int[2*n-1];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
                board[i][j] ='.';
        }
        NQueens(0,ans,board,n,leftRow,upperDiagonal,lowerDiagonal);
        return ans;
    }
    
    public void NQueens(int col,List<List<String>> ans,char[][] board, int n,int[] leftRow , int [] upperDiagonal,  int [] lowerDiagonal )
    {
        if(col == n)
        {
            ans.add(construct(board));
            return;
        }
        
        for(int row =0; row<n; row++)
        {
           if(leftRow[row] == 0 &&  lowerDiagonal[row+col]==0 && upperDiagonal[n-1 + col-row]==0)
           {
               board[row][col] ='Q';
               leftRow[row] =1;
               lowerDiagonal[row+col]=1;
               upperDiagonal[n-1 + col-row]=1;
               NQueens(col+1,ans,board,n,leftRow,upperDiagonal,lowerDiagonal); 
               board[row][col] ='.';
               leftRow[row] =0;
               lowerDiagonal[row+col] =0;
               upperDiagonal[n-1+col-row] =0;   
           }
        }
    }
    
   public List<String> construct(char[][]board)
    {
       List<String> res = new  LinkedList<>();
       for(int i=0; i<board.length; i++)
       {
           String s = new String(board[i]);
           res.add(s);
       }
       return res;
    }
}
class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]= '.';
            }
        }
        return NQueens(board, 0,n);
        
    }
    
    public int NQueens(char[][] board, int row, int n){
        if(row==n){
            return 1;
        } 
        int count =0;
        
        for(int col=0; col<n; col++){
            if(isSafe(board,row,col))
            {
                board[row][col]='Q';
                count += NQueens(board, row+1, n);
                board[row][col] ='.';
            }
        }
        return count;
    }
    
    public boolean isSafe(char[][] board, int row, int col){
        //top-vertical
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q')
                return false;
        }
        
        //diagonal-left
        int x = row-1;
        int y= col-1;
        while(x>=0 && y>= 0){
            if(board[x][y]=='Q')
                return false;
            x--;
            y--;
        }
        
        x= row-1;
        y= col+1;
        while(x>=0 && y<board.length ){
            if(board[x][y] =='Q')
                return false;
            x--;
            y++;
        }
        return true;
    }
}
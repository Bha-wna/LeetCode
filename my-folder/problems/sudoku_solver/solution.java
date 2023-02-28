class Solution {
    public void solveSudoku(char[][] board) {
        validSudoku(board);
        return;
        
    }
    public boolean validSudoku(char[][] board) {
         int row =-1, col=-1;
         boolean empty = true;

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
              if(board[i][j] == '.'){
                  row = i;
                  col =j;
                  empty = false;
                  break;
              }   
            }
            if(empty == false)
              break;
        }

        if(empty == true)
          return true;

        for(int i=1; i<=9; i++){
            if(isSafe(board, row, col, i)){
                board[row][col] = (char)(i + '0');
                if(validSudoku(board)==true)
                   return true;
                else   
                   board[row][col] = '.';
            }
        }
        return false;  
    }

    public boolean isSafe(char[][]board, int row, int col, int num){
        
        //check rowwise
        for(int i=0; i<9;i++){
            if(board[i][col]== (char)(num + '0'))
               return false;
        }

        //check columnwise
        for(int i=0; i<9; i++){
            if(board[row][i] == (char)(num + '0'))
              return false;
        }

        //check subbox
        int rowstart = row- row%3;
        int colstart = col - col%3;
        for(int i= rowstart ; i< rowstart +3; i++){
            for(int j= colstart; j< colstart+3; j++){
                if(board[i][j] == (char)(num + '0'))
                  return false;
            }
        }
        return true;
    }
}
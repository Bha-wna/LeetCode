class Solution {
    
    static List<List<String>> ansList ;
    public List<List<String>> solveNQueens(int n) {
      char[][] board = new char[n][n];
        for(int i=0; i<n ;i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        ansList = new ArrayList<List<String>>();
        NQueens(n,board,0);
        return ansList;     
    }
    
    public void NQueens(int n, char[][] board, int row){
        if(row == n){
            List<String> list = new ArrayList<>();
            for(char rows []: board){
                String ans = "";
                for(char val: rows){
                    ans += val;
                }
                list.add(ans);
            }
            ansList.add(list);
            return;
        }
        
        for(int col =0; col< n; col++){
            if(isSafe(row, col, board))
            {
                board[row][col] = 'Q';
                NQueens(n, board, row+1);
                board[row][col] = '.';
            }
        }
    }
    public static boolean isSafe(int row, int col, char[][]board){
       
        //top-vertical
        for(int i=row-1; i>=0; i--){
            if(board[i][col] =='Q')
                return false;
        }
        
        //diagonal left
        int x = row-1;
        int y=col-1;
        while(x >=0 && y>=0){
            if(board[x][y] == 'Q')
                return false;
            x--;
            y--;
        }
        
        //diagonal right
        int a = row-1;
        int b = col+1;
        while(a>=0 && b <= board.length-1){
            if(board[a][b]== 'Q')
                return false;
            a--;
            b++;
        }
        
        return true;
    }
}
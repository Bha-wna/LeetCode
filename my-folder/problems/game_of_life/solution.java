class Solution {
    public void gameOfLife(int[][] board) {
        int live =0;
        int dead =0;
        int ans[][] = new int[board.length][board[0].length];
        int [] dx = {0,1,1,-1,0,-1,-1,1};
        int [] dy = {1,1,0,1,-1,-1,0,-1};
        for(int i=0; i<board.length; i++)
        {
           for(int j=0; j<board[i].length; j++)
            {
             for(int k=0; k<8; k++)
             {
               int newX = i + dx[k];
               int newY = j + dy[k];
               
               if(newX >=0 && newX <board.length && newY >=0 && newY <board[i].length)
               {
                   if(board[newX][newY]==1)
                       live++;
                   else
                       dead++;
               }
             }
               if(board[i][j] ==1)
                {
                 
                  if(live ==2 || live ==3)
                     ans[i][j] =1;
                  else
                      ans[i][j] =0;
                }
              else
                {
                if(live ==3)
                    ans[i][j] =1;
                  else
                      ans[i][j]=0;
                
                }
               live =0; dead=0;
            }
      }
        for(int i=0; i<board.length; i++)
        {
           for(int j=0; j<board[i].length; j++)
           {
             board[i][j] = ans[i][j];  
           }
        }
       
    }
}
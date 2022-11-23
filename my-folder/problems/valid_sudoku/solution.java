class Solution {
    public boolean isValidSudoku(char[][] board) {
       // int n = board.length;
      //  int m = board[0].length;
        Map<Character,Integer> m = new HashMap<>();
       // traverse each row
          int r = 0;
          while(r<9)
          {
            for(int j=0; j<9; j++)
            {
               if(m.containsKey(board[r][j])&& board[r][j]!='.' )
               {
                   return false;}
                else
                    m.put(board[r][j],1);
            }
              m.clear();
              r++;
          }
      //  System.out.println(m);
         m.clear();
        //traverse each column
        int i=0;
        while(i<9)
        {
            for(int j=0; j<9; j++)
            {
               if(m.containsKey(board[j][i]) && board[j][i] != '.')
               // { System.out.println("2");
                   return false;
               
                else
                    m.put(board[j][i],1);
            }
            m.clear();
            i++;
        }
        // System.out.println(m);
        //check in grid of 3
        m.clear();
            for(int a =0; a<9; a+=3)
            {
                for(int b = 0; b<9; b+=3)
                {  
                    for(int c = a+0; c<a+3; c++)
                    {
                        for(int d = b+0; d<b+3; d++)
                        {
                           if(m.containsKey(board[c][d]) && board[c][d] != '.')
                           {  // System.out.println("3");
                               return false;
                           }
                           else 
                               m.put(board[c][d],1);
                        }
                       
                    }
                     m.clear();
                }
            }
        
        return true;
    }
}
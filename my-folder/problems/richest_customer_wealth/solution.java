class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth ;
         int k =0;
        int z[] = new int[accounts.length]; 
         for(int row=0; row< accounts.length ;row++)
         {
           for(int col=0 ; col<accounts[row].length ; col++)   
           {
              k = k + accounts[row][col]  ;  
           }
          for(int i = row; i< accounts.length; i++)
              {
                z[i]= k;
              }
           k =0;
            
         }
            wealth = z[0]; 
            for(int a = 0; a<z.length; a++) 
            {
              if(z[a]>= wealth)
              {
                  wealth = z[a];
              }
                
            }
          return wealth;
         }
      }

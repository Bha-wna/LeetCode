class Solution {
    public int[] processQueries(int[] queries, int m) {
        int [] p = new int[m];
        int [] arr = new int[queries.length];
        for(int i=0; i<m; i++)
        {
          p[i] = i+1;     
        }
        
        for(int i=0; i<queries.length; i++)
        {
           for(int j=0; j<p.length; j++)
           {
              if(queries[i]== p[j])
              { 
                arr[i] = j; 
                 int temp = p[j];    
                  
                for (int k=j; k>0; k--)
                {   
                   // if(k ==j)
                   // { 
                   //  p[k+1]= k+2;
                   // }
                    p[k] = p[k-1];
                }
                 p[0] = temp;             
              }  
           } 
        }
        return arr;   
    }
}
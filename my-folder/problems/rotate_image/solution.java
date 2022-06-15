class Solution {
    public void rotate(int[][] matrix) {
       for(int i=0; i<matrix.length; i++)
       {
           for(int j=i; j<matrix[i].length; j++)
           {
               int temp = matrix[i][j];
               matrix[i][j]= matrix[j][i];
               matrix[j][i] = temp;
           }
           System.out.print(Arrays.toString(matrix[i]));
       }
        System.out.println(Arrays.deepToString(matrix));
        
       for(int i=0; i<matrix.length; i++)
       { 
           int k =  matrix[i].length-1;
          for(int j=0; j<k; j++)
          { 
            
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][k]; 
            matrix[i][k] = temp;
             k--; 
          }
          System.out.print(Arrays.toString(matrix[i]));  
       }
    }
}
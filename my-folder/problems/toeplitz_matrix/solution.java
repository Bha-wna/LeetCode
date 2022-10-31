class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                int r = i;
                int c = j;
                int temp = matrix[i][j];
                while(r <row && c< col)
                {
                   if(matrix[r++][c++] != temp)
                       return false;
                }
            }
        }
        return true;
    }
}
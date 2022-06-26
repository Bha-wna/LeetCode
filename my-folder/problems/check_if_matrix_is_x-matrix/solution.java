class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for(int i=grid.length-1; i>=0; i--)
        {
            for(int j=grid[i].length-1;j>=0; j--)
            {
                if(i==j && grid[i][j] ==0)
                    return false;
                if((i+j)==grid.length-1 && grid[i][j]==0)
                    return false;
                if(i !=j && (i+j) != grid.length-1 && grid[i][j] >0) 
                    return false;
            }
            
        }
        return true;
    }
}
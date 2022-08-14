class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] result = new int[grid.length-2][grid.length-2];
        for(int row =0; row<= grid.length-3; row++)
        {
            for(int col=0; col<=grid.length-3; col++)
            {
                int j= row; 
                int max = Integer.MIN_VALUE;
                for(int c =0; c<3; c++)
                {
                    int k= col;
                    for(int cc = 0; cc<3; cc++)
                    {
                        if(max < grid[j][k])
                            max = grid[j][k];
                        k++;
                    }
                    j++;
                }
                result[row][col] = max;
            }
        }
        return result;
    }
}
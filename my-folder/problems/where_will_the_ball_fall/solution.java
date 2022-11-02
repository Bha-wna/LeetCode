class Solution {
    public int[] findBall(int[][] grid) {
       int n = grid.length;
       int m = grid[0].length;
        int[] res = new int[m];
       
        for(int i=0; i<m; i++)
        {
            res[i] = dfs(0,i, grid, n,m);
        }
        return res;
    }
    public int dfs(int row, int col,int[][] grid, int n, int m )
    {
        if(row == n)
            return col;
        
        int new_col = grid[row][col] + col;
        if(new_col < 0 || new_col >= m || grid[row][new_col] != grid[row][col])
            return -1;
        else
            return dfs(row+1, new_col, grid, n,m);
    }
}
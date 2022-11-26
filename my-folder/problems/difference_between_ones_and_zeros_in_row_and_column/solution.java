class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        //it will store #1's
        int[] rows = new int[n];
        int[]cols = new int[m];
        
        int r =0;
        while(r<n){
        for(int i=0; i<m; i++)
        {
           if(grid[r][i]==1)
               rows[r]++;
        }
        r++;
        }
        int c =0;
        while(c<m){
        for(int i=0; i<n; i++)
        {
           if(grid[i][c]==1)
               cols[c]++;
        }
        c++;
        }
        
        System.out.println(Arrays.toString(rows) + " ..."+ Arrays.toString(cols));
        
        int[][] diff = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                diff[i][j] = rows[i] + cols[j] -(n-rows[i])-(m-cols[j]);
            }
        }
        return diff;
    }
}
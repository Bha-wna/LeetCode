class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m =  matrix[0].length;
        int l = 0;
       int r = (matrix.length * matrix[0].length)-1;
        while(l<=r)
        {
            int mid = (l+r)/2;
            int x = mid/m;
            int y = mid%m;
            if(target < matrix[x][y])
                r = mid-1;
            else if(target >matrix[x][y])
                l = mid+1;
            else
                return true;
        }
        return false;
    }
}
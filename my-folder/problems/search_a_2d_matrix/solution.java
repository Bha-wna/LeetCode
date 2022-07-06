class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int idx=0;
        for(int i=0; i<matrix.length; i++)
        {
            if(target <= matrix[i][matrix[i].length-1])
            {   idx =i; 
                break;
            }
        }
        System.out.println(idx);
        for(int j=0; j<matrix[0].length; j++)
        {
            if(matrix[idx][j]==target)
                return true;
        }
        return false;
    }
}
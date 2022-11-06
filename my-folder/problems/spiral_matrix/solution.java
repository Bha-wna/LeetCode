class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> ans = new ArrayList<>();
       int m = matrix.length;
        int n = matrix[0].length;
       int fr =0, lr =  m-1, fc = 0, lc = n-1;
        
        while(fr <= lr && fc<= lc)
        {
            //fr
            for(int i=fc; i<=lc; i++)
            {
                ans.add(matrix[fr][i]);
            }
            fr++;
            //lc
            for(int i=fr; i<=lr; i++)
            {
                ans.add(matrix[i][lc]);
            }
            lc--;
            
            //lr
            if(fr<=lr){
            for(int i=lc; i>=fc; i--)
            {
                ans.add(matrix[lr][i]);
            }
            lr--;
            }
            //fc
            if(fc<=lc){
            for(int i=lr; i>=fr; i--)
            {
                ans.add(matrix[i][fc]);
            }
            fc++;
            }
        }
        return ans;
    }
}
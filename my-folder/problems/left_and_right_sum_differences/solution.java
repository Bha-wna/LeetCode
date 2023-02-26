class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] l = new int [n];
        int[] r = new int[n];
        int[] ans = new int[n];
        if(n==1)
            return ans;
        
        l[0] = 0;
        for(int i=1; i<n; i++){
            l[i] = l[i-1] + nums[i-1];
        }
        r[n-1] =0;
        for(int i=n-2; i>=0; i--){
            r[i] = r[i+1] + nums[i+1];
        }
        
        for(int i=0; i<n; i++){
            ans[i] = Math.abs(l[i]-r[i]);
        }
        System.out.println(Arrays.toString(l));
        System.out.println(Arrays.toString(r));
        return ans;
    }
}
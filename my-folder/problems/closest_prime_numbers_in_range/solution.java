class Solution {
    public int[] closestPrimes(int left, int right) {
        
        int[] vis = new int[right+1];
        vis[0] = 1;
        vis[1] = 1;
        for(int i = 2; i <= right; i++){
            if(vis[i]==0){
                int c=3;
                int x = i * 2;
                while(x <= right){
                    vis[x] = 1;
                    x=i*c;
                    c++;
                }
            }
        }
        int[] ans = new int[2];
        Arrays.fill(ans,-1);
        int diff = Integer.MAX_VALUE, curr=0, f=1;
        for(int i = left; i <= right; i++){
            if(vis[i] ==0 && f==1){
                curr = i;
                f=0;
            }
            else if(vis[i] ==0 && f==0){
                if( i - curr < diff){
                    ans[0] = curr;
                    ans[1] = i;
                    diff = i - curr;
                }
                curr = i;
            }
        }
        return ans;
    }
}
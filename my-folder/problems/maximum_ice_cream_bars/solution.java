class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;
        int i=0;
        int ans =0;
        while(coins >0 && i<n )
        {
            if(costs[i] > coins)
                return ans;
            coins -= costs[i];
            i++;
            ans++;
        }
        return ans;
    }
}
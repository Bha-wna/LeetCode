class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 1000000000;
        
        while(l<=r){
            int mid = l + (r-l)/2;
            
            if(canEatInTime(piles, mid,h))
                r = mid-1;
            else
                l= mid+1;
        }
        return l;
    }
    public boolean canEatInTime(int[] piles, int k, int h){
        long hours =0;
        
        for(int pile: piles){
            int div = pile/k;
            hours += div;
            if(pile %k !=0)
                hours++;
        }
        return hours <=h;
    }
}
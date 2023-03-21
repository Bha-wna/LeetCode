class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int len = flowerbed.length;
        if(len==1){
            if(flowerbed[0]==0)
                return true;
            if(flowerbed[0]==1 && n==0)
                return true;
            return false;
        }
        for(int i=0; i<len; i++){
            if(n==0)
                return true;
            if(flowerbed[i]==0 && i >0 && i <len-1){
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0)
                {  n--;
                flowerbed[i]=1;
                }
            }
            else if(flowerbed[i]==0 && i ==0){
                if(flowerbed[i+1]==0)
                {  n--;
                flowerbed[i]=1;
                }
            }
            else if(flowerbed[i]==0 && i ==len-1){
                if(flowerbed[i-1]==0)
                {   n--;
                flowerbed[i]=1;
                }
        }           
    }
         return n==0;
    }
}
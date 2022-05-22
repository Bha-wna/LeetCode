class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
       
        
        int need[] = new int[rocks.length];
        
        for(int i=0; i< need.length; i++ )
        {
            need[i] = capacity[i]-rocks[i];
        }
        
        Arrays.sort(need);
        for(int i=0; i< need.length; i++)
        {
            if(need[i] != 0)
            {
                if(need[i]<=additionalRocks)
                {
                    
                   additionalRocks = additionalRocks- need[i];
                   need[i]=0; 
                }
            }
        }
        
//         int j=0;
//         while(capSum != rockSum || additionalRocks != 0)
//         {
//             if(need[j] !=0)
//             {
//                 if(rocks[j]< capacity[j])
//                 {
//                     rocks[j] = rocks[j] +1;
//                     j++;
//                     additionalRocks--;
//                 }
//             }
              
//             for(int i=0; i<rocks.length; i++)
//             {
//                  rockSum += rocks[i];
//             }
//         }
        
        int count=0;
        for(int i=0; i<need.length; i++)
        {
            if(need[i]==0)
                count++;
        }
        return count;
    }
}
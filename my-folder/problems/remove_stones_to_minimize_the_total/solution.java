class Solution {
    public int minStoneSum(int[] piles, int k) {
        //find max element in array
        //reduce the element by val/2
        
     //   lets implement priority queue
       PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)-> y-x); 
        for(int i=0; i<piles.length; i++)
        {
           pq.add(piles[i]); 
        }
        
      while(k>0)
      {  
           int val = pq.poll();
           pq.add(val-val/2);
           k--;  
      }
      System.out.println(pq);
     //   System.out.println(Arrays.toString(piles));
      int sum =0;
      while(!pq.isEmpty())
      {
          sum += pq.poll();
      }
      return sum;
    }
    
    // public int findmax(int[]piles)
    // {
    //     int maxi = 0,index =0;
    //     for(int i=0; i<piles.length; i++)
    //     {
    //         if(piles[i]>maxi)
    //         {  maxi = piles[i];
    //            index =i;
    //         }
    //     }
    //     return index;
    // }
}
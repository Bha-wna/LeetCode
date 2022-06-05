class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map <Integer, Integer> hm = new HashMap<>();
        
        int j=0;
        while(j< nums.length)
        {
            hm.put(nums[j], j);
            j++;
        }
         for(int i=0; i<operations.length; i++)
         {
            if(hm.containsKey(operations[i][0]))
               {  hm.put(operations[i][1], hm.get(operations[i][0]));
                  int b = hm.get(operations[i][0]);
                  nums[b] = operations[i][1];
               }
         }
               return nums;
    }
}
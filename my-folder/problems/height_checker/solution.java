class Solution {
    public int heightChecker(int[] heights)
    {
       int [] expected = new int[heights.length];
        int count =0;
    
        expected = heights.clone();
       Arrays.sort(expected);
       
        for(int i=0; i<expected.length; i++)
        {
          if(expected[i] != heights[i])
              count++;
        }
      return count;  
    }
}
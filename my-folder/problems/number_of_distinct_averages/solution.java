class Solution {
    public int distinctAverages(int[] nums) {
       int min= 0, max= 0;  
        Set<Double> ans = new HashSet<>();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            arr.add(nums[i]);
        }
        Collections.sort(arr);
        int i=0;
        int j = arr.size()-1;
        while(i<j)
        {
           min = arr.get(i++);
           max = arr.get(j--); 
           double avg = (min +max)/2.0; 
           ans.add(avg);   
        }
        return ans.size();
    }
}
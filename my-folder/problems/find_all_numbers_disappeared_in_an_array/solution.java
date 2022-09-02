class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            if(nums[i] != nums[nums[i]-1])
            {  
                int temp =  nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;   
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(nums));
        
        for(int j=0; j<nums.length; j++)
        {
            if(j !=  nums[j]-1)
                ans.add(j+1);
        }
         return ans;
    }
}
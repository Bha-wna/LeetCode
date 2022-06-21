class Solution {
    public List<List<Integer>> permute(int[] nums) {
      
        List<List<Integer>> ans =  new ArrayList<>();
        recurPermute(0,nums,ans);
        return ans;
    }
    
    public void recurPermute(int ind, int[] nums, List<List<Integer>> ans)
    {
        if(ind==nums.length)
        {
           ArrayList<Integer> ds = new ArrayList<>();
            for(int i=0; i<nums.length; i++)
            {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=ind; i<nums.length; i++)
        {
            swap(nums,ind, i);
            recurPermute(ind+1, nums, ans);
            swap(nums,ind, i);
        }
    }
    public void swap(int[] nums, int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
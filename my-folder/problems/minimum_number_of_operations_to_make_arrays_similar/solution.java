class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        Arrays.sort(nums);
        Arrays.sort(target);
        List<Integer> oddnums= new ArrayList<>();
        List<Integer> evennums= new ArrayList<>();
        List<Integer> oddtar= new ArrayList<>();
        List<Integer> eventar= new ArrayList<>();
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]%2==0)
                evennums.add(nums[i]);
            else
                oddnums.add(nums[i]);
            if(target[i]%2 ==0)
                eventar.add(target[i]);
            else
                oddtar.add(target[i]);
        }
        long ans =0;
        for(int i=0; i<oddnums.size(); i++)
        {
            ans += Math.abs(oddnums.get(i)-oddtar.get(i))/2;
        }
        for(int i=0; i<evennums.size(); i++)
        {
            ans += Math.abs(evennums.get(i)-eventar.get(i))/2;
        }
        return ans/2;
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List <List<Integer>>  arr = new ArrayList<List<Integer>>();
        Set <List<Integer>> s = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0; i< nums.length-2; i++)
        {  
            // if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
          int l= i+1; 
          int r= nums.length-1;
            while(l<r)
            {
             if((nums[i] + nums[l] + nums[r])==0)
                { // arr.add(new ArrayList<Integer>());
                List<Integer> li =new ArrayList<Integer>(Arrays.asList(nums[i], nums[l], nums[r]));
              /*   li.add(nums[i]);
                 li.add(nums[l]);
                 li.add(nums[r]); */
                 s.add(li);  
                l++;
                r--;
                }
                else if
                ((nums[i] + nums[l] + nums[r]) <0)
                       l++;
                 else
                     r--;
            }
        }
     /*  for(int i=0; i< s.size(); i++)
       {
           arr.add(s(i));
       }
       */
        for(List<Integer> l :s)
        {arr.add(l);}  
           
    return arr ;                  
    }
                
 }

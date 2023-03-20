class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Map<Integer,List<Integer>> m1 = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(!m1.containsKey(nums[i]%k)){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                m1.put(nums[i]%k,temp);
            }      
            else
                m1.get(nums[i]%k).add(nums[i]);
            
        }
        System.out.println(m1);
        
        int ans =1; 
        for(Map.Entry<Integer,List<Integer>> entry : m1.entrySet()){
            List<Integer> list = entry.getValue();
            Collections.sort(list);
            
            //nums[i],frequency
            Map<Integer,Integer> m2 = new TreeMap<>();
            for(int i=0; i<list.size(); i++){
                m2.put(list.get(i),m2.getOrDefault(list.get(i),0)+1);
            }
            
          //  System.out.println(m2);
            int prev = Integer.MIN_VALUE, prevTaken=0, prevNotTaken=1, currTaken=0, currNotTaken=0; 
            for(Map.Entry<Integer,Integer> m2Entry: m2.entrySet())
            {
                int freq = m2Entry.getValue();
                int poss_subsets = (int)Math.pow(2,freq)-1;
                int curr = m2Entry.getKey(); //System.out.println(curr);
                if(prev +k ==curr){
                    currNotTaken = prevTaken + prevNotTaken;
                    currTaken = prevNotTaken * poss_subsets;
                }
                else{
                    currNotTaken = prevTaken + prevNotTaken;
                    currTaken = (prevNotTaken + prevTaken) * poss_subsets;
                }
                
               // if(curr==22)
              //  System.out.println("CurrentTaken :"+ currTaken + "NotTaken :"+ currNotTaken);
                prevTaken = currTaken;
                prevNotTaken = currNotTaken;
                prev = curr;
                
            }
            ans *= (currTaken + currNotTaken);
          //  System.out.println(ans);
        }
       // System.out.println(m2);
        return ans-1;
    }
}
class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
      HashMap <String, Integer> hm = new HashMap<>();
      for(int i=0; i<senders.length; i++)
      { 
        hm.putIfAbsent(senders[i],0);  
        hm.put(senders[i],hm.get(senders[i])+countOfWords(messages[i]) );
      } 
//       int max = hm.get(senders[0]);
        
//       for(int i=0; i<hm.size(); i++)
//       {
//        if(hm.get(i)>max)
//            max = hm.get(i);
          
//       }
        Map<String, Integer> shm = new TreeMap<>(hm);
        
        int maxi = -1;
        String ans = "";
        for(String it : shm.keySet()){
            int temp = shm.get(it);
            if(temp >= maxi){
                maxi = temp;
                ans = it;
            }
        }
        return ans;
    }
    public int countOfWords(String word)
    {
        String countArray[] = word.split(" ");
        return countArray.length;
    }
}
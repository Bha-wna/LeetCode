class Solution {
    public String oddString(String[] words) {
       HashMap<ArrayList,String> m = new HashMap<>();
        String ans ="";
        for(int i=0; i<words.length; i++) 
        {
            ArrayList<Integer> arr = new ArrayList<>();
            String temp = words[i];
            for(int j=0; j<=temp.length()-2; j++)
            {
                arr.add((int)(temp.charAt(j+1)-'a') - (int)(temp.charAt(j)- 'a'));
                
            }
            System.out.println(arr);
            if(m.containsKey(arr))
                m.put(arr,null);
            else
                m.put(arr,temp);
        }
        System.out.println(m);
       for( Map.Entry<ArrayList, String> entry : m.entrySet())
       {   if(entry.getValue() != null)
               ans = entry.getValue();
                
       }
        
        return ans;
    }
}
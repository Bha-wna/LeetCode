class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character,Integer> m = new HashMap<>();
        int diff =0;
        for(int i=0; i< s.length(); i++)
        {
            if(!m.containsKey(s.charAt(i)))
                m.put(s.charAt(i),i);
            else if(m.containsKey(s.charAt(i)))
            {  
                diff = (i - m.get(s.charAt(i))-1);
                if(distance[(int)s.charAt(i) -97] != diff )
                    return false;
            }
                
        }
        return true;
    }
}
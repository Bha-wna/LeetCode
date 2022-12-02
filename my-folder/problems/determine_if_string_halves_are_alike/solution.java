class Solution {
    public boolean halvesAreAlike(String s) {
       char[] arr = {'a','e','i','o','u','A','E','I','O','U'}; 
        
        // Map<Character,Integer> m1 = new HashMap<>();
        // Map<Character,Integer> m2 = new HashMap<>();
        int ct1=0;
        int ct2=0;
        for(int i=0; i<s.length()/2; i++)
        {
            char ch = s.charAt(i);
            
            // m1.put(ch,m.getOrDefault(ch,0)+1);
            for(int j=0;j<arr.length;j++)
            {if(ch==arr[j])
                ct1++;
            }
        }
        
        for(int i=s.length()/2; i<s.length(); i++)
        {
            char ch = s.charAt(i);
           // m2.put(ch,m.getOrDefault(ch,0)+1);
            for(int j=0; j<arr.length; j++)
            {
                if(ch==arr[j])
                    ct2++;
                
            }
          
        }
         if(ct1==ct2)return true;
            return false; 
        
    }
}
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans = new ArrayList<>();
        if(p.length() >s.length())
            return ans;
        int lenp = p.length();
        int [] freqP = new int[26];
        int [] freqS = new int[26];
        for(int i=0; i<lenp;i++)
        {
            freqP[p.charAt(i)-'a']++;
        }
        
        for(int i=0; i<lenp; i++)
        {
            freqS[s.charAt(i)-'a']++;
        }
        
        boolean flag = true;
        for(int i=0; i<26;i++)
        {
            if(freqS[i] != freqP[i])
            {
                flag = false;
                break;
            }
        }
        if(flag==true)
            ans.add(0);
        
        //boolean flag = true;
        for(int j= lenp; j<s.length(); j++)
        {
           freqS[s.charAt(j-lenp)-'a']--;
            freqS[s.charAt(j)-'a']++;
            flag = true;
            for(int i=0; i<26;i++)
            {
                if(freqP[i] != freqS[i])
                {
                    flag = false;
                    break;
                }
            }
            if(flag==true)
              ans.add(j-lenp+1);
        }
       return ans; 
    }
}
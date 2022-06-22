class Solution {
    public List<List<String>> partition(String s) {
       
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> ds = new ArrayList<>();
        pp(0,s,res,ds);
        return res;
    }
    
    public void pp(int ind, String s,List<List<String>> res, List<String> ds )
    {
        if(ind==s.length())
        {   res.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=ind; i<s.length(); i++)
        {
           if(isPalindrome(ind,i,s))
           {    ds.add(s.substring(ind,i+1));
                pp(i+1,s,res,ds);
                ds.remove(ds.size()-1);
           }
        }
    }
    
    public boolean isPalindrome(int ind, int i, String s)
    {
        while(ind<=i)
        {
            if(s.charAt(ind)!= s.charAt(i))
                return false;
            ind++; i--;
        }
        return true;
    }
}
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 ="";
        for(String it : word1)
        {
            s1 += it;
        }
        for(String it : word2)
        {
            s2 += it;
        }
        if(s1.equals(s2))
            return true;
        
        return false;
    }
}
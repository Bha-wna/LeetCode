class Solution {
    public int minDeletionSize(String[] strs) {
        int ct =0;
        for(int i=0; i<strs[0].length(); i++)
        {
            for(int j=0; j<strs.length-1; j++)
            {
                if(strs[j].charAt(i)-'a' >strs[j+1].charAt(i)-'a')
                { 
                  ct++;
                  break;
                }
            }
        }
        return ct;
    }
}
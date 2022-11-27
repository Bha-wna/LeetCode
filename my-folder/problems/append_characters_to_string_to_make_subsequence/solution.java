class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }
            else i++;
        }
        if(j==0)
            return t.length();
        if(j==t.length())
            return 0;
        int x = t.length()-j;
        return x;
    }
}
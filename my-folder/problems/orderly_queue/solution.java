class Solution {
    public String orderlyQueue(String s, int k) {
       // int n = s.length();
       //  String x ="";
       //  String t= s;
        if(k>1)
        {
            char [] res = s.toCharArray();
            Arrays.sort(res);
            String ans = new String(res);
            return ans;
        }
        
        String res = s;
        for (int i = 1; i < s.length(); i++) {
            String tmp = s.substring(i) + s.substring(0, i);
            if (res.compareTo(tmp) > 0) res = tmp;
        }
        return res;
    }
}
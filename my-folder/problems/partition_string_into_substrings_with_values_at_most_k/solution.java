class Solution {
    public int minimumPartition(String s, int k) {
   
        int ans = 0;
        int n = s.length();
        int temp = 0;
        String str = String.valueOf(k);
        int len = str.length();
        if(len == 1){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i)-'0' > k)
                    return -1;
            }
            return s.length();
        }
        for(int i = 0; i < s.length();){
            int x = Math.min(i + len, n);
            String sub = s.substring(i,x);
            if(sub.compareTo(str) <0){
               i+=len;
            } else{
                i+=(len-1);
            }
            ans++;
        }
        return ans;
    }
}

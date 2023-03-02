class Solution {
    public int compress(char[] chars) {
        int count=1, i;
        String s ="";
        
        for(i=0; i<chars.length-1; i++){
            if(chars[i]==chars[i+1])
                count++;
            else{
               if(count==1)
                   s+= chars[i];
                else
                { s+= chars[i];
                  s+= count;
                }
                count =1;
            }
        }
            if(count==1)
                   s+= chars[i];
                else
                { s+= chars[i];
                  s+= count;
                }
       // System.out.println(s);
       
            for(int j=0; j<s.length(); j++){
                chars[j] = s.charAt(j);
            }
        
        return s.length();
    }
}
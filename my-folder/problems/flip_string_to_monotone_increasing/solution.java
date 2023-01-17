class Solution {
    public int minFlipsMonoIncr(String s) {
        int onescount =0;
        int flipcount =0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch =='1')
                onescount++;
            else
            {
                if(onescount==0)
                    continue;
                else
                    flipcount++;
            }
            if(flipcount >onescount)
              flipcount = onescount;
        }
        
        
        return flipcount;
    }
}
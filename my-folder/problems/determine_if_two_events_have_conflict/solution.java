class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        
        int st1 = Integer.parseInt(event1[0].replace(":",""));
        int et1 = Integer.parseInt(event1[1].replace(":",""));
        
        int st2 = Integer.parseInt(event2[0].replace(":",""));
        int et2 = Integer.parseInt(event2[1].replace(":",""));
        
        if(st1>= st2 && st1 <= et2)
            return true;
        if(et1 >= st2 && et1<= et2)
            return true;
        if(st2>= st1 && st2 <= et1)
            return true;
        if(et2 >= st1 && et2<= et1)
            return true;
        return false;
        
    }
}
class Solution {
    public static final String[] keys = {"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<>();
        if(digits == null || digits.length() == 0) 
           return ret;
        helper("",digits, 0, ret);
        return ret;
    }

    public void helper(String p, String digits, int offset, List<String> ret){
        
        if(offset >= digits.length()){
            ret.add(p);
            return;
        }

        String word = keys[(digits.charAt(offset) -'0')];
        for(int i=0; i<word.length(); i++){
            helper(p + word.charAt(i), digits, offset+1, ret);
        }
    }
}
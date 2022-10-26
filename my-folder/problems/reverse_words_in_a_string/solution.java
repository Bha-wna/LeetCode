class Solution {
    public String reverseWords(String s) {
        // String ans ="";
        // String temp ="";
        // List<String> arr = new ArrayList<>();
        // for(int i=s.length()-1; i>=0; i--)
        // { // System.out.println(i);
        //     if(i==0)
        //     {
        //         temp += s.charAt(i);
        //         arr.add(temp);
        //     }
        //     if(s.charAt(i)==' ')
        //     {
        //         arr.add(temp);
        //         temp ="";
        //         continue;
        //     }
        //     temp += s.charAt(i);
        // }
        // System.out.println(arr);
        // // for(int i=0)
        // return " ";
        boolean flag = false;
        String temp ="";
        ArrayList<String> ass = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                temp += s.charAt(i);
                flag = true;
            } else{
                if(temp != "")
                    ass.add(temp);
                temp = "";
                flag = false;
            }
        }
        if(flag)
            ass.add(temp);
        System.out.println(ass);
      //  return "";
        
        String ans ="";
        for(int i=ass.size()-1; i>=0; i--)
        {
            if(i==0)
                ans+= ass.get(i);
            else
              ans+= ass.get(i) + " ";
        }
        return ans;
    }
}
class Solution {
    public String makeGood(String s) {
        if(s.length()<2)
            return s;
        String temp = s;
        while(true)
        {
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=1; i<temp.length(); )
            {
                if(Math.abs(temp.charAt(i-1) - temp.charAt(i))==32)
                {  arr.add(i);
                   arr.add(i-1);
                   i+=2;
                }
                else i++;
            }
            System.out.println(arr);
            if(arr.size()==0)
                break;
            String ans ="";
            for(int i=0; i<temp.length(); i++)
            {
                if(!arr.contains(i))
                    ans += temp.charAt(i);
            }
            temp = ans;
            System.out.println(temp);
        }
       return temp;
    }
}
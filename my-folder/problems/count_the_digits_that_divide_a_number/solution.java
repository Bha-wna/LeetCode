class Solution {
    public int countDigits(int num) {
        List<Integer> s = new ArrayList<>();
        int val = num;
        int count =0;
        
        while(num>0)
        {
            s.add(num%10);
            num = num/10;
        }
        System.out.println(s);
        
        for(int i:s)
        {
            if(val%i==0)
                count++;
        }
        return count;
    }
}
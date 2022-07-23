class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Arrays.sort(ranks);
        Arrays.sort(suits);
        for(int i=0; i<=suits.length-5; i++)
        {   char c = suits[i]; 
            if(c==suits[i+1] && c==suits[i+2] && c==suits[i+3] && c==suits[i+4])
               return "Flush";
        }
        for(int i=0; i<=ranks.length-3;i++)
        {   int temp = ranks[i];
            if(temp==ranks[i+1] && temp ==ranks[i+2])
                return "Three of a Kind";
        }
        for(int i=0; i<=ranks.length-2;i++)
        {   
            if(ranks[i]==ranks[i+1])
                return "Pair";
        }
        
        return "High Card";
    }
}
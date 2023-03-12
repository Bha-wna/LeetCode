class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        List<String> ans = new ArrayList<>();
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(int i= left; i<=right; i++){
            char start = words[i].charAt(0);
            char end = words[i].charAt(words[i].length()-1);
            
            if(vowels.contains(start) && vowels.contains(end))
                ans.add(words[i]);
        }
        return ans.size();
    }
}
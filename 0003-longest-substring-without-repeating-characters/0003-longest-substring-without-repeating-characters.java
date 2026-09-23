class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            HashSet<Character> set = new HashSet<>();
            int count = 0;
            for (int j = i; j < s.length(); j++) 
            {
                boolean substring = set.contains(s.charAt(j));
                if (substring == true) 
                {
                    break;
                }
                set.add(s.charAt(j));
                count++;

                if (count > max) 
                {
                    max = count;
                }
            }
        }
        return max;
    }
}
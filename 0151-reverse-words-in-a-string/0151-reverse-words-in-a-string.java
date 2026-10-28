class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.trim().split("\\s+");

        List<String> wordList = Arrays.asList(s1);
        Collections.reverse(wordList);
        
        String result = String.join(" ", wordList);
        return result;
    }
}
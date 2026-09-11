class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        String lastS = words[words.length - 1];
        return lastS.length();
    }
}
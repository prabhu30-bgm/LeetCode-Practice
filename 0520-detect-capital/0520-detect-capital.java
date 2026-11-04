class Solution {
    public boolean detectCapitalUse(String word) {
        String word1 = word.toUpperCase();
        if(word.equals(word1))
            return true;

        String word2 = word.toLowerCase();
        if(word.equals(word2))
            return true;

        String word3 = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        if (word.equals(word3)) 
            return true;

        return false;
    }
}
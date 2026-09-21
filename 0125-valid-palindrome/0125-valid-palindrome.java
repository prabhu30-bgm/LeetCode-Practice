class Solution {
    public boolean isPalindrome(String s) {
        boolean palindrome = true;

        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        String reverse = new StringBuilder(str).reverse().toString();

        if(reverse.equals(str))
            return true;

        return false;
    }
}
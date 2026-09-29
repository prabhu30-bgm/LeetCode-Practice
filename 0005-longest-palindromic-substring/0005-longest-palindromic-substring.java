class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxLength = 1;
        
        for (int len = 1; len <= n; len++) 
        {
            for (int i = 0; i <= n - len; i++) 
            {
                int j = i + len - 1;
                
                if (len == 1) 
                {
                    dp[i][j] = true;
                } 
                else if (len == 2) 
                {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } 
                else 
                {
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
                }
                
                if (dp[i][j] && len > maxLength) 
                {
                    start = i;
                    maxLength = len;
                }
            }
        }
        return s.substring(start, start + maxLength);
    }
}

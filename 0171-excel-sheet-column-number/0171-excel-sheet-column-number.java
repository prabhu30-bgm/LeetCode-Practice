class Solution {
    public int titleToNumber(String columnTitle) {
        int value = 0;

        for (int i = 0; i < columnTitle.length(); i++) 
        {
            char ch = columnTitle.charAt(i);
            int charValue = ch -'A'+1;
            value = value*26+charValue;
            
        }
        return value;
    }
}
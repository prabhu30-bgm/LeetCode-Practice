class Solution {
    public boolean checkString(String s) 
    {
        int firstIndex = s.length(); 
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == 'b') 
            {
                firstIndex = i;
                break; 
            }
        }

        for (int i = firstIndex + 1; i < s.length(); i++) 
        {
            if (s.charAt(i) == 'a') 
            {
                return false;
            }
        }
        return true;
    }
}
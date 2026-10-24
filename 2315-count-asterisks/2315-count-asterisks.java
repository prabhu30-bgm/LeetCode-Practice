class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean insideBar = false;

        for(int i = 0; i < s.length(); i++)
        {
            char cur= s.charAt(i);
            if(cur == '|')
                insideBar = !insideBar;

            if(cur == '*' && !insideBar)
                count++;
        }
        return count;
    }
}
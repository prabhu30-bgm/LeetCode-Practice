class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0))
        {
            return false;
        }

        int num = 0;

        while(x > num)
        {
            int rem = x % 10;
            num = (num * 10) + rem;
            x = x / 10;
        }
        
        return (x == num || x == num / 10);
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        int num = 0, temp = x;

        while(temp!=0){
            int d = temp%10;
            num = num * 10 + d;
            temp = temp/10;
        }
        return x == num;
    }
}
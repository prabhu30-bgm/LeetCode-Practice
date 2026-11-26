class Solution {
    public boolean canAliceWin(int n) {
        int stones = 10;
        boolean isAlice = true;
        
        while (n >= stones) {
            n -= stones;
            stones--;
            isAlice = !isAlice;
        }
        return !isAlice;    
    }
}
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1)
            return true;

        int rem = n;
        while(rem > 0)
        {
            if(rem == 1)
                return true;
            rem %= 2; 
            if(rem == 1) 
                return false; 
            rem = n / 2; 
            n = rem; 
        }
        return false;

    }
}
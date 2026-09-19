class Solution {
    public int reverse(int x) {
        int sym = 1;
        long reverse = 0, digits;
        if(x < 0)
        {
            sym = -1;
            x = -x;
        }

        while(x > 0)
        {
            digits = x % 10;
            reverse = reverse * 10 + digits;
            x = x/10;
        }
        reverse = reverse * sym;

        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) 
        {
            return 0;
        }

        return(int) reverse;
    }
}
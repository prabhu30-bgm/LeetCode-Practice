class Solution {
    public int reverseBits(int n) {
        int reverse = 0;
        for(int i = 0; i < 32; i++)
        {
            int onebit = n & 1;
            reverse = (reverse << 1) | onebit;
            n = n >>> 1;
        }
        return reverse;

        // WITH JAVA BUILT-IN FUNCTIONS - TIME COMPLEXITY IS HIGH
        
        // String Str = Integer.toBinaryString(n);
        // while( Str.length() < 32) 
        // { 
        //     Str = "0" + Str; 
        // }
        // String Reverse = new StringBuilder(Str).reverse().toString();
        // long Str2 = Long.parseLong(Reverse, 2);
        // return (int) Str2;
    }
}
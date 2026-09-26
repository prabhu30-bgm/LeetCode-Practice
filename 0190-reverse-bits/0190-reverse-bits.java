class Solution {
    public int reverseBits(int n) {
        String Str = Integer.toBinaryString(n);
        while( Str.length() < 32) 
        { 
            Str = "0" + Str; 
        }
        String Reverse = new StringBuilder(Str).reverse().toString();
        long Str2 = Long.parseLong(Reverse, 2);
        return (int) Str2;
    }
}
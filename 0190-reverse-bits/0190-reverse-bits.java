class Solution {
    public int reverseBits(int n) {
        //When i was first saw this problem, i thought this program may take time to solve because of converting integer to binary then binary to reverse and then back to integer but in JAVA we have to many built-in functions that helped me to solve this problem within 10-15 minutes.

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
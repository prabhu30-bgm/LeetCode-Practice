class Solution {
    public int hammingWeight(int n) {
        String Str = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < Str.length(); i++)
        {
            if( Str.charAt(i) == '1')
            {
                count++;
            }
        }
        return count;
    }
}
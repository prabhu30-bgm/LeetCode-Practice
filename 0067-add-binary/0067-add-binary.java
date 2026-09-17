class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()- 1;
        int j = b.length() - 1;
        int extra = 0;

        while(i >= 0 || j >= 0 || extra != 0)
        {
            int total = extra;
            if(i >= 0)
            {
                total += a.charAt(i) - '0';
                i--;
            }
            if(j >= 0)
            {
                total += b.charAt(j) - '0';
                j--;
            }
            sb.append(total % 2);
            extra = total / 2;
        }
        return sb.reverse().toString();
    }
}
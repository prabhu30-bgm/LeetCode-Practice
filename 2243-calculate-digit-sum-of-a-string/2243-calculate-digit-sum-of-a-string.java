class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k)
        {
            StringBuilder s1 = new StringBuilder();

            for(int i = 0; i < s.length(); i+=k)
            {
                String s1Group = s.substring(i, Math.min(s.length(), i+k));
                int sum = 0;

                for(int j = 0; j < s1Group.length(); j++)
                {
                    sum += s1Group.charAt(j) - '0';
                }

                s1.append(sum);
            }
            s = s1.toString();
        }
        return s;
    }
}
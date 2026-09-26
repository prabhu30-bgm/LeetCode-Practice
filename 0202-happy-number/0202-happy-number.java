class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> count = new HashSet<>();
        while(n != 1)
        {
            if(count.contains(n))
                return false;
            
            count.add(n);
            int sum = 0;
            while(n > 0)
            {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
        }
        return true;
    }
}
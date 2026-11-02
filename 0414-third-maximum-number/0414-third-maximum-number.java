class Solution {
    public int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int count = 0;
        
        for (int n : nums) 
        {
            
            if ((count >= 1 && n == max1) || 
                (count >= 2 && n == max2) || 
                (count == 3 && n == max3))
                continue;
            
            if (count == 0|| n > max1) 
            {
                max3 = max2;
                max2 = max1;
                max1 = n;
                count++;
            } 
            else if (count == 1 || n > max2) 
            {
                max3 = max2;
                max2 = n;
                count++;
            } 
            else if(count == 2 || n > max3) 
            {
                max3 = n;
                count++;
            }
        }

        if (count < 3) 
            return max1;
        else 
            return max3;
    }
}
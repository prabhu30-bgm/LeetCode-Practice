class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        // for(int i = 0; i < nums.length; i++)
        // {
        //     if(nums[i] > max1 )
        //     {
        //         max2 = max1;
        //         max1 = nums[i];
        //     }
        //     else if(nums[i] > max2 )
        //     {
        //         max2 = nums[i];
        //     }
        // }
    
        for (int num : nums) 
        {
            if (num > max1) 
            {
                max2 = max1;
                max1 = num;
            } 
            else if (num > max2) 
            {
                max2 = num;
            }
        }

        return (max1-1) * (max2 - 1);
    }
}
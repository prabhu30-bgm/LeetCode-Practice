class Solution {
    public int rob(int[] nums) {
        int total = 0;

        if(nums.length == 1)
        {
            total = nums[0];
        }
        else if(nums.length == 2)
        {
            total = Math.max(nums[0], nums[1]);
        }
        else
        {
            int first = 0;
            int second = 0;

            for(int i = 0; i <= nums.length - 1; i++)
            {
                int current = second + nums[i];

                if(current > first)
                {
                    total = current;
                }
                else
                {
                    total = first;
                }

                second = first;
                first = total;
            }
        }

        return total;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int curMax = nums[0];
        int curMin = nums[0];

        for(int i = 1; i < nums.length ; i++)
        {
            int maxNum = nums[i];
            if(maxNum < 0)
            {
                int temp = curMax;
                curMax = curMin;
                curMin = temp;
            }
            curMax = Math.max(curMax * maxNum, maxNum);
            curMin = Math.min(curMin * maxNum, maxNum);

            max = Math.max(max, curMax);
        }
        return max;
    }
}
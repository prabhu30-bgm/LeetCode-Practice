class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            count += nums[i];
            if(nums[i] > max)
                max = nums[i];
        }
        return max*nums.length - count;
    }
}
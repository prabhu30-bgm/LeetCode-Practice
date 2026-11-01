class Solution {
    public int minMoves(int[] nums) {
        int minNum = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length ; i++)
        {
            count += nums[i];
            minNum = Math.min(minNum, nums[i]);
        }
        return count - nums.length * minNum;
    }
}

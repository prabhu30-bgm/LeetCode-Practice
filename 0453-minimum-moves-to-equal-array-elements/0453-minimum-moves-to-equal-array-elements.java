class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int maxNum = nums[nums.length - 1];
        for(int num : nums)
        {
            count += (num - nums[0]);
        }
        return count;
    }
}

class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        for(int num : nums)
        {
            if(num != max)
                count += max - num;
        }
        return count;
    }
}
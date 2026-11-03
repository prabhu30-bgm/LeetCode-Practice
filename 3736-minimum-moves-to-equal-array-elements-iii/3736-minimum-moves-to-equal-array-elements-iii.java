class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > max)
                max = nums[i];
        }
        
        for(int num : nums)
        {
            if(num != max)
                count += max - num;
        }
        return count;
    }
}
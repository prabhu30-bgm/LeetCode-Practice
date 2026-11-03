class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int num : nums)
        {
            count += num;
            if(num > max)
                max = num;
        }
        return max*nums.length - count;
    }
}
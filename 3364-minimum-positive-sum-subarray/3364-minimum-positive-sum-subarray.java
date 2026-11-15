class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int MinSum = Integer.MAX_VALUE;

        for(int i = 0; i < nums.size(); i++)
        {
            int currentSum = 0;
            for(int j = i; j < nums.size(); j++)
            {
                currentSum += nums.get(j);
                int length = j - i + 1;

                if(length >= l && length <= r)
                {
                    if(currentSum > 0)
                        MinSum = Math.min(currentSum, MinSum);
                }
            }
        }
        
        return MinSum == Integer.MAX_VALUE ? -1 : MinSum;
    }
}
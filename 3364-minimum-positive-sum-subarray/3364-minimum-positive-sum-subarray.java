class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int MinSum = Integer.MAX_VALUE;
        int[] prefix = new int[nums.size() + 1];

        for (int i = 0; i < nums.size(); i++) 
            prefix[i + 1] = prefix[i] + nums.get(i);

        for(int i = l; i <= r; i++)
        {
            for(int j = 0; j + i <= nums.size(); j++)
            {
                int currentSum = prefix[i + j] - prefix[j];
                if (currentSum > 0 && currentSum < MinSum) 
                    MinSum = currentSum;
            }
        }
        
        return MinSum == Integer.MAX_VALUE ? -1 : MinSum;
    }
}
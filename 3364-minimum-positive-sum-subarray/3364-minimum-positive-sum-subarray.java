class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++)
        {
            int Sum = 0;
            for(int j = i; j < nums.size(); j++)
            {
                Sum += nums.get(j);
                int length = j - i + 1;

                if(length >= l && length <= r )
                {
                    if (Sum > 0) 
                        minSum = Math.min(minSum, Sum);
                }
            }
        }
        if(minSum != Integer.MAX_VALUE)
            return minSum;

        return -1;
    }
}
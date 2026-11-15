class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int MinSum = Integer.MAX_VALUE;
        int[] Prefix = new int[nums.size() +1];

        for(int i = 0; i < nums.size(); i++)
            Prefix[i+1] = Prefix[i] + nums.get(i);
        
        for(int i = l; i <= r; i++)
        {
            for(int j = 0; i+j <= nums.size(); j++)
            {
                int CurrentSum = Prefix[i + j] - Prefix[j];  
                if(CurrentSum > 0 && CurrentSum < MinSum)
                    MinSum = CurrentSum;
            }
        }
        return MinSum == Integer.MAX_VALUE ? -1 : MinSum ;
    }
}
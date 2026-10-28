class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int minPos = 1; 
        for (int x : nums) 
        {
            if (x == minPos) 
            {
                minPos++;
            }
        }
        return minPos;
    }
}
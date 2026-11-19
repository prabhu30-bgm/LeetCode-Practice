class Solution {
    public int minimizeSum(int[] nums) {
        if (nums.length <= 3) 
            return 0;

        Arrays.sort(nums);
        
        int option1 = nums[nums.length - 1] - nums[2];
        int option2 = nums[nums.length - 3] - nums[0];
        int option3 = nums[nums.length - 2] - nums[1];
        
        return Math.min(option1, Math.min(option2, option3));
    }
}
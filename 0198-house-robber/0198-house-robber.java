class Solution {
    public int rob(int[] nums) {

        int prev2 = 0;
        int prev1 = 0;

        for (int i = 0; i < nums.length; i++) {

            int current = prev2 + nums[i];

            if (current < prev1) {
                current = prev1;
            }

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
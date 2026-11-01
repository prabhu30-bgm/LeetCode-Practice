class Solution {
    public int minMoves(int[] nums) {
        int minNum = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length ; i++)
        {
            count += nums[i];
            minNum = Math.min(minNum, nums[i]);
        }
        return count - nums.length * minNum;
    }
}
// class Solution {
//     public int minMoves(int[] nums) {
//         long sum = 0;
//         int minNum = nums[0];

//         for (int i = 0; i < nums.length; i++) {
//             sum += nums[i];
//             minNum = Math.min(minNum, nums[i]);
//         }

//         return (int) (sum - (long) nums.length * minNum);
//     }
// }
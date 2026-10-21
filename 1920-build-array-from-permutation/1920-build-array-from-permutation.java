class Solution {
    public int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];

        for(int i = 0; i < newArray.length; i++)
            newArray[i] = nums[nums[i]];

        return newArray;
    }
}
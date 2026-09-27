class Solution {
    public int majorityElement(int[] nums) {
        Set<Integer> mySet = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
        {
            int majority = 1;
            if (mySet.contains(nums[i])) {
                continue;
            }
            mySet.add(nums[i]);
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    majority++;
                }
            }
            if (majority > nums.length / 2) 
            {
                return nums[i];
            }
        }
        return -1;
    }
}
class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);
        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target)
                return true;

            if(nums[mid] == nums[left] && nums[mid] == nums[right])
            {
                left++;
                right--;
            }
            else if(nums[left] < nums[mid] && target < nums[mid])
            {
                if(nums[left] <= target && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else
            {
                if(nums[left] < target && target <= nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;

            }
        }
        return false;
    }
}
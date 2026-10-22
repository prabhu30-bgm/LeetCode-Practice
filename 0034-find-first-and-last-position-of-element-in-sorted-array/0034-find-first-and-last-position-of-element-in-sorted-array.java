class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] newArray = new int[]{-1,-1};

         for (int i = 0; i < 2; i++) 
         {
            int left = 0;
            int right = nums.length - 1;
            boolean isFirst = (i == 0);

            while (left <= right) 
            {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) 
                {
                    newArray[i] = mid;
                    
                    if (isFirst) 
                    {
                        right = mid - 1; 
                    } else 
                    {
                        left = mid + 1; 
                    }
                } 
                else if (nums[mid] < target) 
                {
                    left = mid + 1;
                } 
                else 
                {
                    right = mid - 1;
                }
            }
        }
        return newArray;
    }
}
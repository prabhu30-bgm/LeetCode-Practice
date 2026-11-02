class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = searchIndex(nums, target, true);
        int right = searchIndex(nums, target, false); 
        return new int[] {left, right}; 

        /* nother mathod to solve the same

        int[] newArray = new int[]{-1,-1};
         for (int i = 0; i < 2; i++) 
         {
            int left = 0;
            int right = nums.length - 1;
            boolean First = (i == 0);
            while (left <= right) 
            {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) 
                {
                    newArray[i] = mid; 
                    if (First) 
                    {
                        right = mid - 1; 
                    } 
                    else 
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
        return newArray; */
    }

    int searchIndex(int[] nums, int target, boolean foundIndex)
    {
        int left = 0, index = -1;
        int right = nums.length - 1;

        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target)
            {
                index = mid;
                if(!(foundIndex))
                    left = mid + 1;
                else
                    right = mid - 1;
                
            }
            else if (nums[mid] < target) 
                left = mid + 1;
            else 
                right = mid - 1;
        }
        return index;
    }
}
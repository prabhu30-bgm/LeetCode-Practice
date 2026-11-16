class Solution {
    public void sortColors(int[] nums) {
        // for(int i = 0; i < nums.length; i++)
        // {
        //     for(int j = i+1; j < nums.length; j++)
        //     {
        //         if(nums[i] > nums[j])
        //         {
        //             int temp = nums[j];
        //             nums[j] = nums[i];
        //             nums[i] = temp;
        //         }
        //     }
        // }

        int low = 0, mid = 0, high = nums.length - 1;
        while(mid <= high)
        {
           if (nums[mid] == 0) 
           {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) 
            {
                mid++;
            } 
            else 
            {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                
                high--;
            }
        }
    }
}
class Solution 
{
    public int deleteAndEarn(int[] nums) 
    {
        int earned = 0;
        int delete = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > delete)
            {
                delete = nums[i];
            }
        }

        int[] points = new int[delete + 1];

        for(int i = 0; i < nums.length; i++)
        {
            points[nums[i]] += nums[i];
        }

        int first = 0;
        int second = 0;

        for(int i = 0; i <= delete; i++)
        {
            int current = second + points[i];

            if(current > first)
            {
                earned = current;
            }
            else
            {
                earned = first;
            }
            second = first;
            first = earned;
        }
        return earned;
    }
}
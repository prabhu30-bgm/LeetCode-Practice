class Solution {
    public int maxArea(int[] height) {
        int maximum = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right)
        {
            int result = (right - left) * Math.min(height[right], height[left]);
            maximum = Math.max(maximum, result);

            if(height[left] > height[right])
                right--;
            else
                left++;
        }
        return maximum;
    }
}
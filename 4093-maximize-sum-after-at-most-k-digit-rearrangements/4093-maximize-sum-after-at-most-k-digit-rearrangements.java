class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum = 0;
        int[] newNum = new int[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
            
            char[] numbers = String.valueOf(nums[i]).toCharArray();
            
            Arrays.sort(numbers);
            StringBuilder sb = new StringBuilder();
            for(int j = numbers.length - 1; j >= 0; j--)
                sb.append(numbers[j]);

            int Max = Integer.parseInt(sb.toString());

            newNum[i] = Max - nums[i];
        }
        Arrays.sort(newNum);

        int count = 0;
        for(int i = nums.length - 1; i >= 0 && count < k; i--)
        {
            if(newNum[i] > 0)
            {
                sum = sum + newNum[i];
                count++;
            }
        }
        return sum;
    }
}
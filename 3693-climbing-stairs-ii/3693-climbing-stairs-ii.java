class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] newArray = new int[n + 1];
        newArray[0] = 0;

        for (int i = 1; i <= n; i++) 
        {
            newArray[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= 3; j++) 
            {
                if (i - j >= 0) 
                {
                    int jumpCost = costs[i - 1] + j * j;
                    newArray[i] = Math.min(newArray[i],newArray[i - j] + jumpCost);
                }
            }
        }
        return newArray[n];
    }
}
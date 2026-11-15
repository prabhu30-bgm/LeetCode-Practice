class Solution {
    public int numOfSubarrays(int[] arr) {
        int count = 0;
        int odd = 0;
        int even = 1;
        int MOD = 1_000_000_007;
        int currentSum = 0;
        for(int i = 0; i < arr.length ; i++)
        {
            currentSum += arr[i];
            
            if (currentSum % 2 != 0) 
            {
                count = (count + even) % MOD;
                odd++; 
            } 
            else 
            {
                count = (count + odd) % MOD;
                even++; 
            }
        }
        return count;
    }
}
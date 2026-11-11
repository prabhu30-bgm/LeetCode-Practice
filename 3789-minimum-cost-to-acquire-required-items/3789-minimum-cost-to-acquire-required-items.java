class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long op1 = (long) need1 * cost1 + (long) need2 * cost2;

        long op2 = (long) Math.max(need1, need2) * costBoth;

        int common = Math.min(need1, need2);

        long op3 = (long) common * costBoth + (long) (need1 - common) * cost1 + (long) (need2 - common) * cost2;

        long min1 = Math.min(op2, op3);
        
        return Math.min(op1,min1);
    }
}
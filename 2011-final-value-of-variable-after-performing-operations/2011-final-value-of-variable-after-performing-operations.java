class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String op : operations) 
        {
            if (op.charAt(1) == '+' || op.charAt(0) == '+') 
            {
                X++;
            } else {
                X--;
            }
        }
        return X;
    }
}
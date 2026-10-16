class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0,left = 0,bottom = n - 1, right = n - 1;
        int i, num = 1;
        while(num <= n*n)
        {
            for(i = left; i<= right; i++)
            {
                matrix[top][i] = num;
                num++;
            }
            top++;

            for(i = top; i<= bottom; i++)
            {
                matrix[i][right] = num;
                num++;
            }
            right--;

            if(top <= bottom)
            {
                for(i = right; i >= left; i--)
                {
                    matrix[bottom][i] = num;
                    num++;
                }
                bottom--;   
            }

            if(left <= right)
            {
                for(i = bottom; i >= top; i--)
                {
                    matrix[i][left] = num;
                    num++;
                }
                left++;
            }
        }
        return matrix;
    }
}
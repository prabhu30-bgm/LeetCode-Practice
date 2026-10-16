class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int bottom = n - 1, right = n - 1,top=0,left= 0;;
        int i, num = 1;
        while(left <= right && top <= bottom)
        {
            for(i = left; i<= right; i++)
            {
                matrix[top][i] = num;
                System.out.println(num);
                num++;
            }
            top++;

            for(i = top; i<= bottom; i++)
            {
                matrix[i][right] = num;
                System.out.println(num);
                num++;
            }
            right--;

            if(top <= bottom)
            {
                for(i = right; i >= left; i--)
                {
                    matrix[bottom][i] = num;
                    System.out.println(num);
                    num++;
                }
                bottom--;   
            }

            if(left <= right)
            {
                for(i = bottom; i >= top; i--)
                {
                    matrix[i][left] = num;
                    System.out.println(num);
                    num++;
                }
                left++;
            }
        }
        return matrix;
    }
}
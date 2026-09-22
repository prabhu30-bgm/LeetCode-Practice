class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0,left= 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>();
        int i, j;
        while(left <= right && top <= bottom)
        {
            
            for(i = left; i<= right; i++)
            {
                result.add(matrix[top][i]);
            }
            top++;

            for(i = top; i<= bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom)
            {
                for(i = right; i >= left; i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;   
            }

            if(left <= right)
            {
                for(i = bottom; i >= top; i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
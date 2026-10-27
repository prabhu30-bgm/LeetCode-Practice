class Solution {
    public String[] createGrid(int m, int n) {
        char[][] newGrid = new char[m][n];

        for (int i = 0; i < m; i++) //Fill entire M*N with #
        {
            Arrays.fill(newGrid[i], '#');
        }

        for (int i = 0; i < n; i++) //Fill top row with '.'
        {
            newGrid[0][i] = '.';
        }

        for (int i = 0; i < m; i++) //Fill last column with '.'
        {
            newGrid[i][n - 1] = '.';
        }

        String[] result = new String[m];
        for (int i = 0; i < m; i++) 
        {
            result[i] = new String(newGrid[i]);
        }

        return result;
    }
}
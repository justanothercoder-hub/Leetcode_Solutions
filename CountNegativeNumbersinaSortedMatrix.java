class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int row = rows-1;
        int col = 0;

        int negativeCount = 0;

        while(row>=0 && col<=cols-1){
            if(grid[row][col]<0){
               negativeCount += cols - col;
               row--;
            }
            else{
                col++;
            }
        }
        return negativeCount;
        
    }
}

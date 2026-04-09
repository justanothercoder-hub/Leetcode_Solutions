class Solution {
    int maxArea = 0;
    public int maxAreaOfIsland(int[][] grid) {

        for(int row = 0 ; row < grid.length ; row++){
            for(int col = 0 ; col < grid[0].length ; col++){
                if(grid[row][col]==1){
                    int currentArea = findArea(grid , row , col);
                    maxArea = Math.max(maxArea, currentArea);
                }
            }
        }
        return maxArea;
    }

    public int findArea(int[][]grid , int row , int col){
        if(row<0 || row>=grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0){
            return 0;
        }
       
        int area = 0;

        if(grid[row][col]==1){
            area = 1;
            grid[row][col] = 0;
        }

        area += findArea(grid, row - 1, col);
        area += findArea(grid, row + 1, col);
        area += findArea(grid, row, col - 1);
        area += findArea(grid, row, col + 1);

        return area;
    }
}

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int l = mat.length;

        for(int row=0;row<mat.length;row++){
            sum += mat[row][row]+mat[row][l-row-1];
        } 
        if(l%2 == 1){
            int p = l/2;
            sum = sum - mat[p][p];
        }    
        return sum;   
    }
}

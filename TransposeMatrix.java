class Solution {
    public int[][] transpose(int[][] matrix) {
        int i = matrix.length;
        int j = matrix[0].length;
        int[][] tmat = new int[j][i];

        for(int m=0 ; m<i; m++){
            for(int n=0; n<j; n++){
                tmat[n][m]=matrix[m][n];
            }
        }
        return tmat;
        
    }
}

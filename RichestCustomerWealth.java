class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int row = 0; row<accounts.length; row++){
            int currWealth = 0;
            for(int col = 0; col<accounts[0].length; col++){
                currWealth += accounts[row][col];
            }
            maxWealth = Math.max(currWealth,maxWealth);
        }

        return maxWealth;
        
    }
}

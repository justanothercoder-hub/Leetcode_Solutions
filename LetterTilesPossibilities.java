class Solution {
    public int numTilePossibilities(String tiles) {
        int[] counts = new int[26];
        
        for (char c : tiles.toCharArray()) {
            counts[c - 'A']++;
        }
        
        return dfs(counts);
    }

    private int dfs(int[] counts) {
        int totalCount = 0;

        for (int i = 0; i < 26; i++) {
            if(counts[i]==0){
                continue;
            }
            totalCount++;
            counts[i]--;

            totalCount += dfs(counts);

            counts[i]++;
        }

        return totalCount;
    }
}

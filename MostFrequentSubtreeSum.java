class Solution {
    Map<Integer, Integer> sumCounts = new HashMap<>();
    int maxFrequency = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        helper(root);
        List<Integer> list = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : sumCounts.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                list.add(entry.getKey());
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }

    public int helper(TreeNode node) {
        
        if (node == null) {
            return 0; 
        }

        int leftSum = helper(node.left);
        int rightSum = helper(node.right);

        int currentSum = node.val + leftSum + rightSum;
        int currentCount = sumCounts.getOrDefault(currentSum, 0) + 1;
        sumCounts.put(currentSum, currentCount);

        maxFrequency = Math.max(maxFrequency, currentCount);

        return currentSum;
    }
}

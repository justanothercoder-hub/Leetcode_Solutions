class Solution {
    public int goodNodes(TreeNode root) {
        int maxSoFar = Integer.MIN_VALUE;
        List<TreeNode> list = new ArrayList<>();
        dfs(maxSoFar, root, list);     
        return list.size();   
    }

    public void dfs(int maxSoFar, TreeNode node, List<TreeNode> list){
        if(node == null){
            return;
        }
        if(node.val >= maxSoFar){
            list.add(node);
            maxSoFar = Math.max(maxSoFar, node.val);
        }
        dfs(maxSoFar, node.left, list);
        dfs(maxSoFar, node.right, list);
    }
}

class Solution {
    int minDepth = Integer.MAX_VALUE;
    
    public int minDepth(TreeNode root) {
        if (root == null) return 0; 
        
        int store = 1; 
        depthCheck(root, store);
        
        return minDepth;
    }

    public void depthCheck(TreeNode root, int store) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            minDepth = Math.min(minDepth, store);
        }

        depthCheck(root.left, store + 1);
        depthCheck(root.right, store + 1);
    }
}

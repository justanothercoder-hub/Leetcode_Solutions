class Solution {
    int maxDepth = 0 ;
    public int maxDepth(TreeNode root) {
        int store = 0;
        depthCheck(root,store);
        return maxDepth;
    }

    public void depthCheck(TreeNode root,int store){

        if(root==null) return;

        else if(root != null){
            store++;
            maxDepth = Math.max(maxDepth, store);
        }

        depthCheck(root.left,store);
        depthCheck(root.right,store);

    }
}

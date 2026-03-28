class Solution {
    public TreeNode increasingBST(TreeNode root) {

        TreeNode dummy = new TreeNode(0);
        TreeNode curr = dummy;

        List<TreeNode> list = new ArrayList<>();

        inOrder(root, list);

        for( TreeNode node : list){
            curr.right = node;
            node.left = null;
            curr = node;
        }

        return dummy.right;
        
    }

    public void inOrder(TreeNode node, List<TreeNode> list){

        if(node == null){
            return;
        }

        inOrder(node.left, list);
        list.add(node);
        inOrder(node.right, list);

    }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();

        preOrder(root,list);

        return list;
    }

    public void preOrder(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }

        list.add(node.val);
        preOrder(node.left, list);
        preOrder(node.right, list);
    }
}

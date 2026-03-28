class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> allPaths = new ArrayList<>();
        List<String> currentPath = new ArrayList<>();
        allPathCheck(root, currentPath, allPaths);
        return allPaths;
    }

    public void allPathCheck(TreeNode root, List<String> path, List<String> allPaths) {

        if (root == null) return;

        path.add(String.valueOf(root.val));

        if (root.left == null && root.right == null) {
            allPaths.add(String.join("->", path));
        }
            allPathCheck(root.left, path, allPaths);
            allPathCheck(root.right, path, allPaths);
        

        path.remove(path.size() - 1);
    }
}

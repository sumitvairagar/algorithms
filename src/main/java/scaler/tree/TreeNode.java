package scaler.tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }

    public TreeNode addLeft(int val){
        TreeNode left = new TreeNode(val);
        this.left = left;
        return left;
    }

    public TreeNode addRight(int val){
        TreeNode right = new TreeNode(val);
        this.right = right;
        return right;
    }
}

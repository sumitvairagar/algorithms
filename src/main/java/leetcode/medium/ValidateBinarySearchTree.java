package leetcode.medium;



class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}


public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {


        if(root == null) return true;

        TreeNode currentNode = root;
        TreeNode left = root.left;
        TreeNode right = root.right;

        if(currentNode.left != null){
            if(currentNode.left != null &&currentNode.val < currentNode.left.val) return false;
            isValidBST(left);
        }
        if(currentNode.right == null){
            if(currentNode.right != null && currentNode.val > currentNode.right.val) return false;
            isValidBST(right);
        }



        return true;
    }
}

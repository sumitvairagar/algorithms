package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {

    @Test
    public void validateBinarySearchTree(){
        TreeNode oneNode = new TreeNode(1);
        TreeNode threeNode = new TreeNode(2);
        TreeNode rootNode = new TreeNode(3, oneNode, threeNode);
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        Assertions.assertEquals(true, validateBinarySearchTree.isValidBST(rootNode));
    }


    @Test
    public void validateBinarySearchTreeTwo(){
        TreeNode fourNode = new TreeNode(4);
        TreeNode fifthNode = new TreeNode(5);
        TreeNode oneNode = new TreeNode(1);
        TreeNode threeNode = new TreeNode(2, fourNode, fifthNode);
        TreeNode rootNode = new TreeNode(3, oneNode, threeNode);

        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        Assertions.assertEquals(true, validateBinarySearchTree.isValidBST(rootNode));
    }

    @Test
    public void invalidateBinarySearchTreeTwo(){
        TreeNode fourNode = new TreeNode(4);
        TreeNode fifthNode = new TreeNode(5);
        TreeNode oneNode = new TreeNode(1);
        TreeNode threeNode = new TreeNode(2, fourNode, fifthNode);
        TreeNode rootNode = new TreeNode(0, oneNode, threeNode);

        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        Assertions.assertEquals(false, validateBinarySearchTree.isValidBST(rootNode));
    }


    @Test
    public void invalidateBinarySearchTree(){
        TreeNode oneNode = new TreeNode(1);
        TreeNode threeNode = new TreeNode(2);
        TreeNode rootNode = new TreeNode(0, oneNode, threeNode);
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        Assertions.assertEquals(false, validateBinarySearchTree.isValidBST(rootNode));
    }

}
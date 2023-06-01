package scaler.tree;

import com.sun.source.tree.Tree;
import geekforgeek.easy.array.scaler.MaxSubArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InorderTraversalTest {



    @Test
    public void inOrderTraversal(){
        InorderTraversal inorderTraversal = new InorderTraversal();
        TreeNode root = new TreeNode(1);
        root.addLeft(2).addLeft(3).addRight(4);
        root.addRight(5).addLeft(6).addRight(7);
        int[] expected = new int[] {3, 4, 2, 1, 6, 7, 5};
        int[] result = inorderTraversal.inorderTraversal(root);
        Assertions.assertArrayEquals(expected, result);
    }


}
package scaler.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public int[] inorderTraversal(TreeNode A) {
        List<Integer> ansList = new ArrayList<>();
        TreeNode root = A;
        Stack<TreeNode> stack = new Stack<>();

        while(true){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else{
                if(stack.empty()) break;
                TreeNode node = stack.pop();
                ansList.add(node.val);
                root = node.right;
            }
        }

        int[] ans = new int[ansList.size()];
        for(int i = 0; i < ansList.size(); i++){
            ans[i] =  ansList.get(i);
        }
        return ans;
    }
}

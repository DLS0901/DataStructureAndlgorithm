package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class LeetCode94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        inorderTraversal(result, root);
        return result;
    }

    public void inorderTraversal(List<Integer> result, TreeNode node){
        if(node==null){
            return;
        }
        inorderTraversal(result,node.left);
        result.add(node.val);
        inorderTraversal(result,node.right);
    }

}

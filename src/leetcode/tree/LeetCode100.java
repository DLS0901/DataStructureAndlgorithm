package leetcode.tree;

/**
 * https://leetcode-cn.com/problems/same-tree/
 */
public class LeetCode100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p!=null && q!=null){
            if(p.val == q.val){
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }
        return false;
    }
}


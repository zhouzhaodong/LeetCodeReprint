package xyz.zhouzhaodong.leetcodereprint.simple;

/**
 * 100. 相同的树
 *
 * @author zhouzhaodong
 */
public class IsSameTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 给定两个二叉树，编写一个函数来检验它们是否相同。
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 首先我们需要看给的两个树是否为null，如果都是null的话就相等，不是null就不相等
        // 判断val是否相等同时左右树是否同时不为null或者为null
        if (p == null || q == null) {
            return p == null && q == null;
        }
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) &&
                    isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }

}

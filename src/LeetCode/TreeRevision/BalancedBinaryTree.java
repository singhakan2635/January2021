package LeetCode.TreeRevision;

public class BalancedBinaryTree
{
    public boolean isBalanced(TreeNode root)
    {
        if (root==null)
            return true;
        if (Math.abs(helper(root.left)-helper(root.right))>1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);

    }
    private int helper(TreeNode node)
    {
        if (node==null)
            return 0;

        int left = helper(node.left);
        int right = helper(node.right);

        return Math.max(left,right)+1;

    }
}

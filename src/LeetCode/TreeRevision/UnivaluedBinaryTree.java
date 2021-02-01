package LeetCode.TreeRevision;

public class UnivaluedBinaryTree
{
    public boolean isUnivalTree(TreeNode root)
    {
        if (root==null)
            return true;
        return helper(root);
    }
    private boolean helper(TreeNode node)
    {
        if (node==null)
            return true;
        if (node.left!=null && node.left.val!=node.val )
            return false;
        if (node.right!=null && node.right.val!=node.val)
            return false;

        return helper(node.left) && helper(node.right);
    }
}
